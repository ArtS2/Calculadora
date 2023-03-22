package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Numb1 = findViewById(R.id.Numb1);
        Numb2 = findViewById(R.id.Numb2);
        res = findViewById(R.id.resultado);
    }
    public void soma(View v) {
        int Numb1 = Integer.parseInt(Numb1.getText().toString());
        int Numb2 = Integer.parseInt(Numb2.getText().toString());
        int resultadosoma = Numb1 + Numb2;

    }
     res.setText(resultadosoma + " " );
}