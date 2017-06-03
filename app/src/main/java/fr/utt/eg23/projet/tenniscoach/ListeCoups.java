

package fr.utt.eg23.projet.tenniscoach;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class ListeCoups extends AppCompatActivity {

    ListView mListView;
    private String[] coups = new String[]{
            "Coup1", "Coup2", "Coup3", "Coup4", "Coup5", "Coup6",
            "Coup8", "Coup9", "Coup10", "Coup11", "Coup12", "Coup13",
            "Coup14", "Coup15"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_coups);
        mListView = (ListView) findViewById(R.id.list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListeCoups.this,
                android.R.layout.simple_list_item_1, coups);
        mListView.setAdapter(adapter);

    }
}
