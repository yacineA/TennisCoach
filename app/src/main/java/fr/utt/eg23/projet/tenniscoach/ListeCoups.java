

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

public class ListeCoups extends AppCompatActivity {

    ListView mListView;



    public List<Coup> coups= new ArrayList<Coup>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_coups);
        Coup coup1 = new Coup("Le coup droit","Le coup droit est le coup le plus naturel lorsque l'on débute mais en progressant, de nombreux joueurs préfèrent le revers, qui peut se révéler plus simple techniquement par certains aspects." +
                "A haut niveau niveau, le coup droit est très souvent un point fort, on voit fréquemment les joueurs contourner leur revers pour faire un coup droit.\n" +
                "\n");
        Coup coup2 = new Coup("Le revers","Au tennis, le revers est le coup fait pour frapper la balle du côté du joueur opposé à la main qui tient la raquette (à gauche pour les droitiers et à droite pour les gauchers).\n" +
                "Le revers à une main est difficile pour les débutants, pour les enfants et pour les femmes car en plus de la technique qu'il faut acquérir, il requiert de la force au niveau de l'épaule, de l'avant-bras et du poignet.\n" +
                "Les débutants, les femmes et les enfants auront donc la plupart du temps plus de facilité à jouer avec un revers à 2 mains, qui est moins difficile du point de vue musculaire.");
        Coup coup3 = new Coup("Le Smash","Au tennis, le smash est le coup utilisé à la volée pour répondre à un lob adverse.\n" +
                "On peut également jouer des smashes après le rebond, à la volée ou en fond de court, sur des balles très hautes.\n" +
                "Le geste du smash possède de grandes similitudes avec le geste du service.\n" +
                "\n");
         Coup coup4 = new Coup("La volée","Pour frapper la balle, le joueur doit simplement bouger son avant-bras vers la gauche ou vers la droite en gardant la tête de raquette devant la ligne des épaule. Les souplesses au niveau du poignée sont à bannir. En effet, très souvent, lorsque le volleyeur casse le poignée, l’amplitude du geste augmente, la raquette en phase de préparation passe derrière les épaules et le joueur n’a plus assez de temps pour engager sa frappe en avant de son corps. Le résultat est généralement une balle prise trop tard avec un plan de frappe en arrière et une balle qui sort des limites du terrain.");
        coups.add(coup1);
        coups.add(coup2);
        coups.add(coup3);
        coups.add(coup4);
    }


    public void onStart(){
        super.onStart();

        //create an instance of ListView
        ListView chl=(ListView) findViewById(R.id.checkable_list);
        //set multiple selection mode
        chl.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        //supply data itmes to ListView
        ArrayAdapter<Coup> aa=new ArrayAdapter(this,R.layout.rowlayout,coups);
        chl.setAdapter(aa);
        //set OnItemClickListener

        chl.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a,
                                    View v, int position, long id) {
                Coup cp = (Coup) a.getItemAtPosition(position);
                Intent intent = new Intent(v.getContext(), coup_details.class);
                intent.putExtra("utt.fr.coup", cp);
                startActivity(intent);
            }
        });
    }

}
