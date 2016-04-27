package net.println.easydroid.sharedpreferences;

import android.content.Context;

/**
 * Created by benny on 4/27/16.
 */
public class IntPreference extends PreferenceItem<Integer> {
    public static final String TAG = "StringPreference";

    public IntPreference(Context context, String key) {
        this(context, DEFAULT_PREFERENCE_NAME, key);
    }

    public IntPreference(Context context, String sharedPreferencesName, String key) {
        super(context, sharedPreferencesName, key, 0);
    }

    public IntPreference(Context context, String sharedPreferencesName, String key, int defaultValue) {
        super(context, sharedPreferencesName, key, defaultValue);
    }

    public IntPreference(Context context, String sharedPreferencesName, int mode, String key, int defaultValue) {
        super(context, sharedPreferencesName, mode, key, defaultValue);
    }
}
