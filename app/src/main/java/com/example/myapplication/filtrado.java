package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class filtrado extends AppCompatActivity {

    String criterio_busqd= MainActivity1.busqueda_string;

    @Override   protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrado);
        //imprimo
        System.out.println(criterio_busqd);


    }


}
