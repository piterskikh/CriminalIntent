package com.piterskikh.criminalintent;


import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    private final String TAG = "CRIMELISTACTIVITY";


    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }



}
