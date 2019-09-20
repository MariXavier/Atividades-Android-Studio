package com.example.trocainformacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class RetornoDadosCadastro extends AppCompatActivity
{
    String nome, endereco, telefone, email, mensagem;
    TextView lbNome, lbMensagem, lbEndereco, lbEmail, lbTelefone, teste;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retorno_dados_cadastro);

        lbNome = findViewById(R.id.labelNome);
        lbEndereco = findViewById(R.id.lbEndereco);
        lbTelefone = findViewById(R.id.lbTelefone);
        lbEmail = findViewById(R.id.lbEmail);
        lbMensagem = findViewById(R.id.lbMensagem);

        Intent novaIntent = getIntent();

        nome = novaIntent.getStringExtra("nome");
        endereco = novaIntent.getStringExtra("endereco");
        telefone = novaIntent.getStringExtra("telefone");
        email = novaIntent.getStringExtra("email");
        mensagem = novaIntent.getStringExtra("mensagem");


        lbNome.setText(nome);
        lbEndereco.setText(endereco);
        lbTelefone.setText(telefone);
        lbEmail.setText(email);
        lbMensagem.setText(mensagem);

        Toast.makeText(getApplicationContext(), "Nome: "+nome+ "Mensagem: " +mensagem, Toast.LENGTH_LONG).show();



    }
}
