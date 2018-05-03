package br.com.fiap.nac02.rm77246;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spnAdicionais;
    String [] adicionais = {
            "Batata Média",
            "Refrigerante 500ml",
            "Sorvete Cascão"
    };
    RadioGroup rdgLanches;
    RadioButton rbtSimples;
    RadioButton rbtDuplo;
    RadioButton rbtCombo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnAdicionais = findViewById(R.id.spnAdicionais);
        rdgLanches = findViewById(R.id.rdgLanches);
        rbtSimples = findViewById(R.id.rbtSimples);
        rbtCombo = findViewById(R.id.rbtCombo);
        rbtDuplo = findViewById(R.id.rbtDuplo);
    }

    public void comprar(View view) {
        if(rbtSimples.isChecked() || rbtDuplo.isChecked() || rbtCombo.isChecked()){

        }
    }

    public void combo(View view) {
    }

    public void duplo(View view) {

    }

    public void simples(View view) {

    }
}
