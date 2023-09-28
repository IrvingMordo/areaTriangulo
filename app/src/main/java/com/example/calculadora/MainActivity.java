package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ETbase;
    private EditText ETaltura;
    private Button btbtn;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETbase = findViewById(R.id.ETbase);
        ETaltura = findViewById(R.id.ETaltura);
        btbtn = findViewById(R.id.btbtn);
        resultado = findViewById(R.id.resultado);
        btbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtén la base y la altura ingresadas por el usuario
                double base = Double.parseDouble(ETbase.getText().toString());
                double height = Double.parseDouble(ETaltura.getText().toString());

                // Calcula el área del triángulo
                double area = 0.5 * base * height;

                // Muestra el resultado en el TextView
                resultado.setText("Resultado: " + area + "cm²");
            }
        });

    }
}