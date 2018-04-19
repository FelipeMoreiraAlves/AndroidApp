package br.com.fiap.adaptersandspinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnPaises;
    String [] paises={
            "Angola",
            "Bulgária",
            "China",
            "Dinamarca",
            "Estonia",
            "França"
    };
    AutoCompleteTextView actEstados;
    String[] estados={
            "Amapá",
            "Bahia",
            "Ceará",
            "Distrito Federal",
            "Espírito Santo",
            "Goiás"
    };

    DatePicker dataNasc;

    TimePicker tmpHoraNasc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataNasc = findViewById(R.id.dataNasc);
        tmpHoraNasc = findViewById(R.id.tmpHoraNasc);
        actEstados = findViewById(R.id.actEstados);
        ArrayAdapter<String> adapterEstados = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,estados);
        actEstados.setAdapter(adapterEstados);

        spnPaises = findViewById(R.id.spnPaises);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, paises);

        spnPaises.setAdapter(adapter);
    }

    public void salvar(View view) {
        int dia = dataNasc.getDayOfMonth();
        int mes = dataNasc.getMonth() + 1;
        int ano = dataNasc.getYear();

        int hora = tmpHoraNasc.getCurrentHour();
        int min = tmpHoraNasc.getCurrentMinute();

        String msg = String.format("Você selecionou: %d/%d/%d - %d:%d", dia, mes, ano, hora, min );

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
