package com.example.exercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner respostas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respostas = (Spinner) findViewById(R.id.spinnerRespostas);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Questao, android.R.layout.simple_spinner_item);
        respostas.setAdapter(adapter);

        final AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = respostas.getSelectedItem().toString();
                if (item != "Linos Torvalds"){
                    Toast.makeText(getApplicationContext(), " Resposta Incorreta" + item, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), " Resposta CERTA" + item, Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        };

        respostas.setOnItemSelectedListener(escolha);
    }
}
