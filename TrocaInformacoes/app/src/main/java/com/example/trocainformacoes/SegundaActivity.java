package com.example.trocainformacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        String nome, mensagem;

        Intent novaIntent = getIntent();

        nome = novaIntent.getStringExtra("nome");
        mensagem = novaIntent.getStringExtra("mensagem");

        //A toast provides simple feedback about an operation in a small popup.
        Toast.makeText(getApplicationContext(), "Nome: "+nome+ "Mensagem: " +mensagem, Toast.LENGTH_LONG).show();
    }
}
