package com.piterskikh.criminalintent;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {

    private final String TAG = "CRIMEACTIVITY";


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
