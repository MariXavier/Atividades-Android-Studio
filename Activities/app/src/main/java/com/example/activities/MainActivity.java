package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    //criamos as variveis para controlar o textview e o button do mainActivity
    private TextView textViewMainActivity;
    private Button buttonMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMainActivity = findViewById(R.id.buttonMainActivity);
        textViewMainActivity = findViewById(R.id.textViewMainActivity);

        buttonMainActivity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent novaActivity = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(novaActivity);
            }
        });
    }
}
