package com.example.classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    TextView textViewNome, textViewIMC;
    EditText txtNome, txtPeso, txtAltura;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        textViewNome = findViewById(R.id.textViewNome);
        textViewIMC = findViewById(R.id.textViewIMC);
        btnCalcular = findViewById(R.id.btnCalcular);


        btnCalcular.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                IMC imc = new IMC();

                imc.setNome(txtNome.getText().toString());
                imc.setPeso(Float.valueOf(txtPeso.getText().toString()));
                imc.setAltura(Float.valueOf(txtAltura.getText().toString()));

                textViewNome.setText(imc.getNome());
                textViewIMC.setText(String.valueOf(imc.calcularIMC()));

            }
        });

    }
}
