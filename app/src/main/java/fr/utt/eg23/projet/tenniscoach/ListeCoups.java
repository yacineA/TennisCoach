

package fr.utt.eg23.projet.tenniscoach;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AbsListView;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;
        import java.util.ArrayList;
        import android.app.Activity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.AdapterView.OnItemClickListener;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.widget.ListView;
        import android.view.View;


        import java.util.ArrayList;
        import java.util.List;

public class ListeCoups extends AppCompatActivity {

    ListView mListView;

    Coup coup1 = new Coup("coup1");
    Coup coup2 = new Coup("coup2");
    Coup coup3 = new Coup("coup3");
    Coup coup4 = new Coup("coup4");

    public List<Coup> coups= new ArrayList<Coup>();



    public ArrayList<String> selectedItems= new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_coups);
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
        ArrayAdapter<Coup> aa=new ArrayAdapter<Coup>(this,R.layout.rowlayout,coups);
        chl.setAdapter(aa);
        //set OnItemClickListener

        chl.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a,
                                    View v, int position, long id) {
                Coup city = (Coup) a.getItemAtPosition(position);
                Intent intent = new Intent(v.getContext(), coup_details.class);
                intent.putExtra("com.example.cities.City", city);
                startActivity(intent);
            }
        });
    }

    public void showSelectedItems(View view){
        String selItems="";
        for(String item:selectedItems){
            if(selItems=="")
                selItems=item;
            else
                selItems+="/"+item;
        }
        Toast.makeText(this, selItems, Toast.LENGTH_LONG).show();
    }

}
