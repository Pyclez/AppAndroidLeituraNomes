package com.example.aprendendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ActivityNova extends AppCompatActivity {

    private EditText nomeEditText;
    private String nomeString;
    private Button trocarActivity;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        trocarActivity = (Button) findViewById(R.id.buttonActivityNova);
        nomeEditText = findViewById(R.id.ActivityNovaNome);

        trocarActivity.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);

            nomeString = nomeEditText.getText().toString().trim();

            if(nomeString.length() == 0){
                nomeString = null;
            }
            intent.putExtra("KEY", nomeString);

            startActivity(intent);
        });
    }
}