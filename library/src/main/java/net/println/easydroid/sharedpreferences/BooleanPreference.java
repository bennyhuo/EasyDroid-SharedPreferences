package net.println.easydroid.sharedpreferences;

import android.content.Context;

/**
 * Created by benny on 4/27/16.
 */
public class BooleanPreference extends PreferenceItem<Boolean> {
    public static final String TAG = "StringPreference";

    public BooleanPreference(Context context, String key) {
        this(context, DEFAULT_PREFERENCE_NAME, key);
    }

    public BooleanPreference(Context context, String sharedPreferencesName, String key) {
        super(context, sharedPreferencesName, key, false);
    }

    public BooleanPreference(Context context, String sharedPreferencesName, String key, boolean defaultValue) {
        super(context, sharedPreferencesName, key, defaultValue);
    }

    public BooleanPreference(Context context, String sharedPreferencesName, int mode, String key, boolean defaultValue) {
        super(context, sharedPreferencesName, mode, key, defaultValue);
    }
}
