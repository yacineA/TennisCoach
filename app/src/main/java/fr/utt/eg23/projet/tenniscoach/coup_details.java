package fr.utt.eg23.projet.tenniscoach;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class coup_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coup_details);
        Bundle bundle = getIntent().getExtras();
        Coup city = bundle.getParcelable("com.example.cities.City");

    }
}
