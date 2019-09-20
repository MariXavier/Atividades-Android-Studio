package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textViewSegundaActivity;
    private Button buttonSegundaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //atribuir o controle para os componentes da tela
        textViewSegundaActivity = findViewById(R.id.textViewSegundaActivity);
        buttonSegundaActivity = findViewById(R.id.buttonSegundaActivity);

        //evento de click do botão
        buttonSegundaActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //abrir outra activity
                Intent abrirMenuMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(abrirMenuMain);
            }
        });

    }
}
