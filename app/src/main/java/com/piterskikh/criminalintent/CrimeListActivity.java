package com.piterskikh.criminalintent;


import android.content.Intent;
import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity
        implements CrimeListFragment.Callbacks
        , CrimeFragment.Callbacks {

    private final String TAG = "CRIMELISTACTIVITY";


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }

    @Override
    public void onCrimeSelected(Crime crime) {

        if (findViewById(R.id.detail_fragment_container) == null) {
            Intent intent = CrimePagerActivity.getIntent(crime.getId());
            startActivity(intent);
        } else {

            Fragment newDetail = CrimeFragment.newInstance(crime.getId());
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.detail_fragment_container, newDetail)
                    .commit();
        }

    }

    @Override
    public void onCrimeUpdated() {
        CrimeListFragment listFragment = (CrimeListFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_container);
        listFragment.updateUi();
    }
}
