package fr.utt.eg23.projet.tenniscoach.tabs;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.utt.eg23.projet.tenniscoach.R;

/**
 * Created by Konstantin on 03.06.2017.
 */

public class Tab_ensemble extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_ensemble, container, false);
        return rootView;
    }
}
