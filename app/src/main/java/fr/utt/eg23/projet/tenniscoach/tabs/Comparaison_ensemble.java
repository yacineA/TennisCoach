package fr.utt.eg23.projet.tenniscoach.tabs;

/**
 * Created by Konstantin on 03.06.2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.utt.eg23.projet.tenniscoach.R;

public class Comparaison_ensemble extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.comparaison_ensemble, container, false);
        return rootView;
    }
}
