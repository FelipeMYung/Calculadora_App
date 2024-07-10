package com.example.calculadora_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnSoma = findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numero1 = findViewById(R.id.numero1);
                int n1 = Integer.parseInt(numero1.getText().toString());

                EditText numero2 = findViewById(R.id.numero2);
                int n2 = Integer.parseInt(numero2.getText().toString());

                int resultado = (n1+n2);

                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Integer.toString(resultado));
                Toast.makeText(MainActivity.this, "Resultado na tela", Toast.LENGTH_LONG).show();
            }
        });
        ImageButton btnMenos = findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numero1 = findViewById(R.id.numero1);
                int n1 = Integer.parseInt(numero1.getText().toString());

                EditText numero2 = findViewById(R.id.numero2);
                int n2 = Integer.parseInt(numero2.getText().toString());

                int resultado = (n1-n2);

                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Integer.toString(resultado));
                Toast.makeText(MainActivity.this, "Resultado na tela", Toast.LENGTH_LONG).show();
            }
        });

        ImageButton btnDivisao = findViewById(R.id.btnDivisao);
        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numero1 = findViewById(R.id.numero1);
                int n1 = Integer.parseInt(numero1.getText().toString());

                EditText numero2 = findViewById(R.id.numero2);
                int n2 = Integer.parseInt(numero2.getText().toString());

                int resultado = (n1/n2);

                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Integer.toString(resultado));
                Toast.makeText(MainActivity.this, "Resultado na tela", Toast.LENGTH_LONG).show();
            }
        });
        ImageButton btnMultiplicacao = findViewById(R.id.btnMultiplicacao);
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numero1 = findViewById(R.id.numero1);
                int n1 = Integer.parseInt(numero1.getText().toString());

                EditText numero2 = findViewById(R.id.numero2);
                int n2 = Integer.parseInt(numero2.getText().toString());

                int resultado = (n1*n2);

                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Integer.toString(resultado));
                Toast.makeText(MainActivity.this, "Resultado na tela", Toast.LENGTH_LONG).show();
            }
        });
    }
}