package com.example.ander_ibanez_2ariketa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Pantailan ditugun parametroak
    private EditText izena_ET;
    private EditText tlf_ET;
    private EditText data_ET;
    private EditText korreoa_ET;
    private EditText abizena_ET;
    private Button bistaratu_BT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Parametroak zehaztu zein IDrekin ditugun pantailan
        izena_ET = findViewById(R.id.izena_ET);
        tlf_ET = findViewById(R.id.tlf_ET);
        data_ET = findViewById(R.id.data_ET);
        korreoa_ET = findViewById(R.id.korreoa_ET);
        abizena_ET = findViewById(R.id.abizena_ET);
        bistaratu_BT = findViewById(R.id.bistaratu_BT);

        bistaratu_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Pantailako datuak lortu
                String izena = izena_ET.getText().toString();
                String abizena = abizena_ET.getText().toString();
                String tlf = tlf_ET.getText().toString();
                String data = data_ET.getText().toString();
                String korreoa = korreoa_ET.getText().toString();


                // Intent-a sortu hurrengo leihoara pasatzeko eta datuak bistaratzeko
                Intent intent = new Intent(MainActivity.this, datuak_leihoa.class);

                // Datuak hurrengo leihora pasatu
                intent.putExtra("izena", izena);
                intent.putExtra("abizena", abizena);
                intent.putExtra("tlf", tlf);
                intent.putExtra("data", data);
                intent.putExtra("korreoa", korreoa);


                // Hurrengo leihoa ireki
                startActivity(intent);
            }
        });


    }
}