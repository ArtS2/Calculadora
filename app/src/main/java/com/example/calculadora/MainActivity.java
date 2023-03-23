package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nb1, nb2;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        nb1 = findViewById(R.id.Numb1);
        nb2 = findViewById(R.id.Numb2);
        res = findViewById(R.id.resultado);
    }
    public void somar (View v) {
        int Numero1 = Integer.parseInt(nb1.getText().toString());
        int Numero2 = Integer.parseInt(nb2.getText().toString());
        int resultadoSoma = Numero1 + Numero2;
        res.setText("O resultado da soma é " + resultadoSoma);
    }
    public void subtrair (View v) {
        int Numero1 = Integer.parseInt(nb1.getText().toString());
        int Numero2 = Integer.parseInt(nb2.getText().toString());
        int resultadoSubtracao = Numero1 - Numero2;
        res.setText("O resultado da subtração é " + resultadoSubtracao);
    }
    public void divisao (View v){
        int Numero1 = Integer.parseInt(nb1.getText().toString());
        int Numero2 = Integer.parseInt(nb2.getText().toString());
        int resultadoDivisao = Numero1 / Numero2 * 2;
        res.setText("O resultado da divisão é " + resultadoDivisao);
    }
    public void multiplicacao (View v){
        int Numero1 = Integer.parseInt(nb1.getText().toString());
        int Numero2 = Integer.parseInt(nb2.getText().toString());
        int resultadoMultiplicacao = Numero1 * Numero2 /2;
        res.setText("O resultado da multiplicacao é " + resultadoMultiplicacao);
    }
}