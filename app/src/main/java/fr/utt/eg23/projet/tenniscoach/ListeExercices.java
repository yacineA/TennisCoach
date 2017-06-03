package fr.utt.eg23.projet.tenniscoach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListeExercices extends AppCompatActivity {

    ListView mListView;
    private String[] exos = new String[]{
            "Exercice1", "Exercice2", "Exercice3", "Exercice4", "Exercice5", "Exercice6",
            "Exercice8", "Exercice9", "Exercice10", "Exercice11", "Exercice12", "Exercice13",
            "Exercice14", "Exercice15"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_exercices);
        mListView = (ListView) findViewById(R.id.list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListeExercices.this,
                android.R.layout.simple_list_item_1, exos);
        mListView.setAdapter(adapter);

    }
}
