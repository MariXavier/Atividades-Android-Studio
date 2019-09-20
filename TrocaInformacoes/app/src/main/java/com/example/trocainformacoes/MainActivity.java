package com.example.trocainformacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText editTextNome, editTextMensagem;
    Button buttonEnviar, buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.txtNome);
        editTextMensagem = findViewById(R.id.editTextMensagem);
        buttonEnviar = findViewById(R.id.buttonEnviar);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);

        editTextNome.requestFocus();

        buttonEnviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent segundaActivity = new Intent(MainActivity.this, SegundaActivity.class);
                //mesmo estilo do metodo POST. Envia o formulario para outro.
                segundaActivity.putExtra("nome", editTextNome.getText().toString());
                segundaActivity.putExtra("mensagem", editTextMensagem.getText().toString());

                startActivity(segundaActivity);
            }
        });

        buttonCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cadastro = new Intent(MainActivity.this, Formulario.class);
                startActivity(cadastro);
            }
        });
    }
}
