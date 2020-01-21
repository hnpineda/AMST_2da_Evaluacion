package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**/
public class MainActivity1 extends AppCompatActivity {

    public ArrayList prod;
    private ListView listview;
    //////////////////
    private ListView listviews;
    private ArrayList<String> names;
    //////////////////
    private Button buscar_btn;
    public EditText busqueda_txt;
    public static String busqueda_string;
    String X_heroe;
    String X_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscar_btn=(Button)findViewById(R.id.button);
        buscar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                busqueda_string= busqueda_txt.getText().toString();
                System.out.println(busqueda_string);
                System.out.println("hola");
                startActivity(new Intent (com.example.myapplication.MainActivity1.this,filtrado.class ));


            }
            });

        busqueda_txt= (EditText)findViewById(R.id.busqueda_txt);
        busqueda_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                busqueda_string= busqueda_txt.toString();
                System.out.println(busqueda_string);
            }
        });

        }
///////////////////////////////////////////////////////////////////
        /*void buscarHeroe () throws FileNotFoundException {
            String url = "https://www.superheroapi.com/api.php/2686075634779594/search/";
            String url_busqueda_h=  busqueda_string;

            FileInputStream db_heroes=  openFileInput("");

        }
        */
    }


