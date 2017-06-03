

package fr.utt.eg23.projet.tenniscoach;

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

public class ListeCoups extends AppCompatActivity {

    ListView mListView;
    private String[] coups = new String[]{
            "Coup1", "Coup2", "Coup3", "Coup4", "Coup5", "Coup6",
            "Coup8", "Coup9", "Coup10", "Coup11", "Coup12", "Coup13",
            "Coup14", "Coup15"
    };
    public ArrayList<String> selectedItems= new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_coups);
    }


    public void onStart(){
        super.onStart();
        //create an instance of ListView
        ListView chl=(ListView) findViewById(R.id.checkable_list);
        //set multiple selection mode
        chl.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        //supply data itmes to ListView
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,R.layout.rowlayout,R.id.txt_lan,coups);
        chl.setAdapter(aa);
        //set OnItemClickListener
        chl.setOnItemClickListener(new OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // selected item
                String selectedItem = ((TextView) view).getText().toString();
                if(selectedItems.contains(selectedItem))
                    selectedItems.remove(selectedItem); //remove deselected item from the list of selected items
                else
                    selectedItems.add(selectedItem); //add selected item to the list of selected items

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
