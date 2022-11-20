package com.example.mon_app02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvListeDesAnimaux;
    ArrayList<String> data = new ArrayList<>(); // liste des animaux
    ArrayAdapter<String> adapter; // pour que la listview affiche tous les éléments présents dans la liste ; on passe par un"adapter"; 3 paramètres : le contexte "this", ,data.

    @Override
        protected void onCreate(Bundle savedInstanceState) { //méthode qui s'active lorsque l'app se crée
        super.onCreate(savedInstanceState); // on recupère le constructeur de la classe qu'on herite (ici AppCompat...)
        setContentView(R.layout.activity_main);  // affiche le design de l'app

        lvListeDesAnimaux = (ListView) findViewById(R.id.ListeViewdesanimaux); // on va chercher notre ListView qu'on a crée

        data.add("Cheval");// on ajoute les éléments dans la liste
        data.add("chien");
        data.add("chat");
        data.add("hamster");
        data.add("poisson");
        data.add("lapin");

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        lvListeDesAnimaux.setAdapter(adapter); // on set l'adapter


        lvListeDesAnimaux.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                // Show a Toast message on item  click
                Toast.makeText(MainActivity.this, "You clicked : " + data.get(pos), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
