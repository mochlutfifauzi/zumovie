package com.zufast.zumovie.ui.settings;


import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.zufast.zumovie.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends PreferenceFragment {


    public SettingsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

    }
}
