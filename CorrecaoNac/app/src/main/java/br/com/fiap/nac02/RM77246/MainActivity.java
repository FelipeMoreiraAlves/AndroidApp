package br.com.fiap.nac02.RM77246;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkLanche01;
    CheckBox chkLanche02;
    CheckBox chkLanche03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkLanche01 = findViewById(R.id.chkLanche01);
        chkLanche02 = findViewById(R.id.chkLanche02);
        chkLanche03 = findViewById(R.id.chkLanche03);
    }

    public void comprar(View view) {
        double total = 0;
        if (chkLanche01.isChecked()){
            total += 15;
        }
        if (chkLanche02.isChecked()){
            total += 15;
        }
        if (chkLanche03.isChecked()){
            total += 15;
        }

        Toast.makeText(this, "O total ficou: R$ " + String.format("%.2f", total), Toast.LENGTH_SHORT).show();
    }

    public void detalhes(View view) {
        Intent it = new Intent(this, Lanche01Activity.class);
        startActivity(it);
    }

    public void detalhes2(View view) {
        Intent it = new Intent(this, Lanche02Activity.class);
        startActivity(it);
    }

    public void detalhes3(View view) {
        Intent it = new Intent( this, Lanche03Activity.class);
        startActivity(it);
    }
}
