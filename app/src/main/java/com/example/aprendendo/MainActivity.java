package com.example.aprendendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button novaTela;
    private Button printar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novaTela = findViewById(R.id.mainActivitySegundaTela);
        printar = findViewById(R.id.mainActivityPrint);

        printar.setOnClickListener(view -> {
            Intent intent = getIntent();
            String string = intent.getStringExtra("KEY");

            if(string == null){
                Toast.makeText(this, "Escreva um nome na segunda tela!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

            }
        });

        novaTela.setOnClickListener(view -> {
            Intent intent2 =  new Intent(this, ActivityNova.class);
            startActivity(intent2);
        });

    }
}