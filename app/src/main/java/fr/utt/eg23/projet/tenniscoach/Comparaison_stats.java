package fr.utt.eg23.projet.tenniscoach;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import fr.utt.eg23.projet.tenniscoach.tabs.Tab2_ensemble_comparaison;
import fr.utt.eg23.projet.tenniscoach.tabs.Tab2_joueur1_comparaison;
import fr.utt.eg23.projet.tenniscoach.tabs.Tab2_joueur2_comparaison;
import fr.utt.eg23.projet.tenniscoach.tabs.Tab_ensemble;
import fr.utt.eg23.projet.tenniscoach.tabs.Tab_joueur1;
import fr.utt.eg23.projet.tenniscoach.tabs.Tab_joueur2;

public class Comparaison_stats extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private Comparaison_stats.SectionsPagerAdapter2 mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparaison_stats);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new Comparaison_stats.SectionsPagerAdapter2(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_statistiques, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    //REMOVED FRAGMENT

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter2 extends FragmentPagerAdapter {

        public SectionsPagerAdapter2(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            //SWITCH ON FRAGMENTS
            switch (position) {
                case 0:
                    Tab2_joueur1_comparaison tab = new Tab2_joueur1_comparaison();
                    return tab;
                case 1:
                    Tab2_joueur2_comparaison tab2 = new Tab2_joueur2_comparaison();
                    return tab2;
                case 2:
                    Tab2_ensemble_comparaison tab3 = new Tab2_ensemble_comparaison();
                    return tab3;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Joueur 1";
                case 1:
                    return "Joueur 2";
                case 2:
                    return "Rapport d'ensemble";
            }
            return null;
        }
    }
}
