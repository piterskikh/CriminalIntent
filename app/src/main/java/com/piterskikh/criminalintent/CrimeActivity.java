package com.piterskikh.criminalintent;


import android.support.v4.app.Fragment;


public class CrimeActivity extends SingleFragmentActivity {

    private final String TAG = "CRIMEACTIVITY";


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
