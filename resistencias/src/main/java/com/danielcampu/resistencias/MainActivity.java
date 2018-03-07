package com.danielcampu.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sCifra1, sCifra2, sMultiplicador, sTolerancia;
    String cifra1, cifra2, multiplicador, tolerancia, valorfinal, c1, c2, tolera;
    TextView tShowResult;
    float tole;
    int unidades = 0, unidades1=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sCifra1 = findViewById(R.id.sCifra1);
        sCifra2 = findViewById(R.id.sCifra2);
        sMultiplicador = findViewById(R.id.sMultiplicador);
        sTolerancia = findViewById(R.id.sTolerancia);
        tShowResult = findViewById(R.id.tShowResult);


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.colores_array, android.R.layout.simple_spinner_item);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.tolerancia_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        sCifra1.setAdapter(adapter);
        sCifra2.setAdapter(adapter);
        sMultiplicador.setAdapter(adapter);

        sTolerancia.setAdapter(adapter1);


        sCifra1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView recibe el adaptar, el view, la posicion
                cifra1 = adapterView.getItemAtPosition(i).toString();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        sCifra2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView recibe el adaptar, el view, la posicion
                cifra2 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sMultiplicador.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView recibe el adaptar, el view, la posicion
                multiplicador = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sTolerancia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //adapterView recibe el adaptar, el view, la posicion
                tolerancia = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void onButtonClicked(View view) {

        String c1c2;
        float valorfin = 0;

        switch (cifra1){

            case "Negro":
                c1 = "0";
                break;

            case "Cafe":
                c1 = "1";
                break;

            case "Rojo":
                c1 = "2";
                break;

            case "Naranja":
                c1 = "3";
                break;

            case "Amarillo":
                c1 = "4";
                break;

            case "Verde":
                c1 = "5";
                break;

            case "Azul":
                c1 = "6";
                break;

            case "Violeta":
                c1 = "7";
                break;

            case "Gris":
                c1 = "8";
                break;

            case "Blanco":
                c1 = "9";
                break;

        }



        switch (cifra2){

            case "Negro":
                c2 = "0";
                break;

            case "Cafe":
                c2 = "1";
                break;

            case "Rojo":
                c2 = "2";
                break;

            case "Naranja":
                c2 = "3";
                break;

            case "Amarillo":
                c2 = "4";
                break;

            case "Verde":
                c2 = "5";
                break;

            case "Azul":
                c2 = "6";
                break;

            case "Violeta":
                c2 = "7";
                break;

            case "Gris":
                c2 = "8";
                break;

            case "Blanco":
                c2 = "9";
                break;

        }


        c1c2 = c1 + c2;


        switch (multiplicador){
            case "Negro":
                valorfin = Float.valueOf(c1c2) * 1;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Cafe":
                valorfin = Float.valueOf(c1c2) * 10;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Rojo":
                valorfin = Float.valueOf(c1c2) * 100;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Naranja":
                valorfin = Float.valueOf(c1c2) * 1000;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Amarillo":
                valorfin = Float.valueOf(c1c2) * 10000;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Verde":
                valorfin = Float.valueOf(c1c2) * 100000;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Azul":
                valorfin = Float.valueOf(c1c2) * 1000000;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Violeta":
                valorfin = Float.valueOf(c1c2) * 10000000;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Gris":
                valorfin = Float.valueOf(c1c2) * 100000000;
                //valorfinal = String.valueOf(valorfin);
                break;

            case "Blanco":
                valorfin = Float.valueOf(c1c2) * 1000000000;
                //valorfinal = String.valueOf(valorfin);
                break;
        }

        switch (tolerancia){
            case "Rojo":
                tole = (float) 0.02;
                break;

            case "Dorado":
                tole = (float) 0.05;
                break;

            case "Gris":
                tole = (float) 0.1;
                break;
        }

        tole =  tole * (float) valorfin;


        if(tole <= 999){
            unidades1 = 0;
            tolera = Float.toString(tole);
        }else if(tole > 999 && tole <= 999999){
            unidades1 = 1;
            tole = tole/1000;
            tolera = Float.toString(tole) + "K";
        }else if(valorfin > 999999){
            unidades1 = 2;
            tole = tole/1000000;
            tolera = Float.toString(tole) + "M";
        }


        if(valorfin <= 999){
            unidades = 0;
        }else if(valorfin > 999 && valorfin <= 999999){
            unidades = 1;
            valorfin = valorfin/1000;
        }else if(valorfin > 999999){
            unidades = 2;
            valorfin = valorfin/1000000;
        }

        valorfinal = String.valueOf(valorfin);

        if(unidades == 0){
            valorfinal = valorfinal + " Tolerancia de +- " + tolera;
        }else if(unidades == 1){
            valorfinal = valorfinal + "K" + " Tolerancia de +- " + tolera;
        }else if(unidades == 2){
            valorfinal = valorfinal + "M" + " Tolerancia de +- " + tolera;
        }


        tShowResult.setText(valorfinal);

    }
}
