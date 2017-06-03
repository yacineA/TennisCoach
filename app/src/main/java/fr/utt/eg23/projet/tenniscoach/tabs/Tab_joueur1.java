package fr.utt.eg23.projet.tenniscoach.tabs;

/**
 * Created by Konstantin on 03.06.2017.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fr.utt.eg23.projet.tenniscoach.R;

public class Tab_joueur1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_joueur1, container, false);
        return rootView;
    }
}
