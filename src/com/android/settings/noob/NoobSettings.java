package com.android.settings.noob;

import com.android.internal.logging.MetricsLogger;

import android.os.Bundle;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class NoobSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.noob_settings);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.NOOB_SETTINGS;
    }
}
