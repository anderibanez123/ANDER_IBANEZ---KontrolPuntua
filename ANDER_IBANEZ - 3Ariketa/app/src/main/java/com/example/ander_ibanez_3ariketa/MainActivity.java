package com.example.ander_ibanez_3ariketa;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton azkoImageButton = findViewById(R.id.azko_BT);
        ImageButton azpeImageButton = findViewById(R.id.azpe_BT);
        ImageButton elgoImagenButton = findViewById(R.id.elgo_BT);

        TextView titulua = findViewById(R.id.titulua_TV);
        TextView testua = findViewById(R.id.testua);



        azkoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulua.setText("AZKOITIA");
                testua.setText("Azkoitia Gipuzkoako barnealdeko herri bat da, Urola ibaiak sortzen duen haranean kokatuta dagoena. Haran hau altuera dexenteko mendiz inguratua dago, Gipuzkoako \"Arno-Tolosa\" antiklinorioaren hegoaldera dagoen apalunean, Urola ibaiak harri bigunen artean egindako ildo edo bidean. Ibaiaren alde hori izan ezik, gainontzeko zatia menditsua da eta horien artean Izarraitz (942 m.) eta Azkarate (628 m.) mendiak ditugu nagusi iparraldera; hegoaldera, berriz, lurrak pixkanaka igotzen doaz, esan berri ditugun altueretara heldu arte, halanola Hirumugarri tontorrean (939 m.), Hirukurutzeta mendilerroan (895 m.).");

            }
        });

        azpeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulua.setText("AZPEITIA");
                testua.setText("Azpeitia fué fundada como villa en 1310 por el rey de Castilla, Fernando IV, quien inicialmente la bautizó con el nombre de \"Garmendia de Iraurgui\". Un año más tarde el mismo rey le concedió el nombre de \"Salvatierra de Iraurgui\", y será en 1397 cuando por primera vez aparezca con el nombre de Azpeitia. Dicho año, se documenta por vez primera el nombre de Azpeitia, \"Ayzpeitia\" mejor dicho, en documentos de las Juntas Generales celebradas en Getaria. Hasta el s. XVI se simultanean las dos denominaciones para referirse a la villa, así como una tercera, \"Urazveitia\". ");

            }
        });

        elgoImagenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                titulua.setText("ELGOIBAR");
                testua.setText("Jatorriz Villamayor de Marquina deitzen zen herria , baina lehenago Campo de Elgóibar deitzen zen leku batean sortua zen . Herria sortu zenetik mende batzuetara izen horrekin ezagutzen amaitu zen. mendearen erdialdera arte  dokumentazioan Villamayor de Marquina bezala ageri da, baina 1457 eta 1463 urteetako Gipuzkoako Kofradiaren ordenantzetan Elgóibar izenarekin ageri da jada eta izen hori nagusitu da gaur egun arte.");

            }
        });
    }
}
