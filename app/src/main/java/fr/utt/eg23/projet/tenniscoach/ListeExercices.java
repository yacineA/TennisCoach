

package fr.utt.eg23.projet.tenniscoach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

import android.widget.AdapterView.OnItemClickListener;


import java.util.List;

public class ListeExercices extends AppCompatActivity {

    ListView mListView;

    public List<Exercice> exos= new ArrayList<Exercice>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_coups);

        Exercice exo1 = new Exercice("Le croisé-décroisé au tennis","Le croisé-décroisé est un grand classique des exercices au tennis. Il s'agit d'un exercice de fond de court très complet : régularité, précision, jeu de jambes.");
        Exercice exo2 = new Exercice("Exercice de précision au service","Petit exercice de précision pour le service au tennis en s'obligeant également à avoir un minimum de puissance.");
        Exercice exo3 = new Exercice("Montée à la volée, volée longue, en régularité","Exercice pour travailler les attaques en coup droit ou revers, les montées à la volée suivies par une volée longue, en régularité. L'exercice permet également un bon travail physique.");
        Exercice exo4 = new Exercice("Exercice de précision dans le couloir","Petit exercice de précision au tennis dans un couloir, pour les coups de fond de court. Cet exercice permet aussi de travailler le petit jeu de jambes au tennis.");

        exos.add(exo1);
        exos.add(exo2);
        exos.add(exo3);
        exos.add(exo4);
    }


    public void onStart(){
        super.onStart();
        //create an instance of ListView
        ListView chl=(ListView) findViewById(R.id.checkable_list);
        //set multiple selection mode
        chl.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        //supply data itmes to ListView
        ArrayAdapter<Exercice> aa=new ArrayAdapter<Exercice>(this,R.layout.rowlayout,exos);
        chl.setAdapter(aa);
        //set OnItemClickListener

        chl.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a,
                                    View v, int position, long id) {
                Exercice ex = (Exercice) a.getItemAtPosition(position);
                Intent intent = new Intent(v.getContext(), exercice_details.class);
                intent.putExtra("utt.fr.exo", ex);
                startActivity(intent);
            }
        });
    }

}
