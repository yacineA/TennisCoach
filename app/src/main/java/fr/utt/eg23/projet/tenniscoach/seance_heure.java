package fr.utt.eg23.projet.tenniscoach;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class seance_heure extends AppCompatActivity {

    TextView timerTextView;
    long startTime = 0;

    //runs without a timer by reposting this handler at the end of the runnable
    Handler timerHandler = new Handler();
    Runnable timerRunnable = new Runnable() {

        @Override
        public void run() {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;

            timerTextView.setText(String.format("%d:%02d", minutes, seconds));

            timerHandler.postDelayed(this, 500);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seance_heure);



        timerTextView = (TextView) findViewById(R.id.timerTextView);

        Button b = (Button) findViewById(R.id.button10);
        b.setText("Démarrer");
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                if (b.getText().equals("Arrêter")) {
                    timerHandler.removeCallbacks(timerRunnable);
                    b.setText("Démarrer");
                } else {
                    startTime = System.currentTimeMillis();
                    timerHandler.postDelayed(timerRunnable, 0);
                    b.setText("Arrêter");
                }
            }
        });

        // Liaison entre l’objet graphique R.id.button et la variable listeCourseButton
        final Button stats = (Button) findViewById(R.id.button11);
        // Création d’un évènement qui attend un clic sur le bouton
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // fonction déclenchée sur le clic du bouton
                // Création d’une activité associée à l’exécution de MaGestionListe.class
                Intent intent = new Intent(seance_heure.this, Statistiques.class);
                // Exécution de l’activité : ouverture de la fenêtre
                startActivity(intent);
            }
        });
    }
}
