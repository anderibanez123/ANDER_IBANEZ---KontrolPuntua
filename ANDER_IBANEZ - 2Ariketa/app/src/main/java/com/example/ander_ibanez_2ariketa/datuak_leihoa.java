package com.example.ander_ibanez_2ariketa;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class datuak_leihoa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datuak_leihoa);

        // Aurreko leihoko datuak hartu
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String izena = extras.getString("izena", "");
            String tlf = extras.getString("tlf", "");
            String data = extras.getString("data", "");
            String korreoa = extras.getString("korreoa", "");
            String abizena = extras.getString("abizena", "");

            // Hartutako datuak pantailaratu
            TextView izenaTextView = findViewById(R.id.izenaTextView);
            izenaTextView.setText("Izena: " + izena);

            TextView tlfTextView = findViewById(R.id.tlfTextView);
            tlfTextView.setText("Telefonoa: " + tlf);

            TextView dataTextView = findViewById(R.id.dataTextView);
            dataTextView.setText("Data: " + data);

            TextView korreoaTextView = findViewById(R.id.korreoaTextView);
            korreoaTextView.setText("Korreoa: " + korreoa);

            TextView abizenaTextView = findViewById(R.id.abizenaTextView);
            abizenaTextView.setText("Abizena: " + abizena);
        }
    }
}
