package com.example.trocainformacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity
{
    EditText txtNome, txtEndereco, txtTelefone, txtEmail, txtMensagem;
    Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        //Encontramos os elementos da tela e armazenamos nas variaveis abaixo.
        txtNome = findViewById(R.id.txtNome);
        txtEndereco = findViewById(R.id.txtEndereco);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtEmail = findViewById(R.id.txtEmail);
        txtMensagem = findViewById(R.id.txtMensagem);

        buttonSalvar = findViewById(R.id.buttonSalvar);

        buttonSalvar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Intenção para abrir outra activity
                Intent retornoDadosCadastro = new Intent(Formulario.this, RetornoDadosCadastro.class);

                //passa as informações para a segunda activity
                retornoDadosCadastro.putExtra("nome", txtNome.getText().toString());
                retornoDadosCadastro.putExtra("endereco", txtEndereco.getText().toString());
                retornoDadosCadastro.putExtra("telefone", txtTelefone.getText().toString());
                retornoDadosCadastro.putExtra("email", txtEmail.getText().toString());
                retornoDadosCadastro.putExtra("mensagem", txtMensagem.getText().toString());

                //inicia a activity RetornoDadosCadastro
                startActivity(retornoDadosCadastro);
            }
        });
    }
}
