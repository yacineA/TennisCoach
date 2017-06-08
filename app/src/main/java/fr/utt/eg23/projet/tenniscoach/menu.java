package fr.utt.eg23.projet.tenniscoach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        // Liaison entre l’objet graphique R.id.button et la variable listeCourseButton
        final Button listeExos = (Button) findViewById(R.id.button_exercice_specifique);
// Création d’un évènement qui attend un clic sur le bouton
        listeExos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(menu.this, ListeExercices.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });



        // Liaison entre l’objet graphique R.id.button et la variable listeCourseButton
        final Button coups = (Button) findViewById(R.id.button3);
// Création d’un évènement qui attend un clic sur le bouton
        coups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(menu.this, ListeCoups.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });



        final Button seance = (Button) findViewById(R.id.button4);
// Création d’un évènement qui attend un clic sur le bouton
        seance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(menu.this, seance_heure.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });



        // Liaison entre l’objet graphique R.id.button et la variable listeCourseButton
        final Button resultatsPrecedents = (Button) findViewById(R.id.button5);
    // Création d’un évènement qui attend un clic sur le bouton
        resultatsPrecedents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(menu.this, Comparaison_stats.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });

    }



}
