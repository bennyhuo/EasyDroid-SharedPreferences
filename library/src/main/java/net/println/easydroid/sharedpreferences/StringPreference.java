package net.println.easydroid.sharedpreferences;

import android.content.Context;

/**
 * Created by benny on 4/27/16.
 */
public class StringPreference extends PreferenceItem<String> {
    public static final String TAG = "StringPreference";

    public StringPreference(Context context, String key) {
        super(context, DEFAULT_PREFERENCE_NAME, key, "");
    }

    public StringPreference(Context context, String sharedPreferencesName, String key) {
        super(context, sharedPreferencesName, key, "");
    }

    public StringPreference(Context context, String sharedPreferencesName, String key, String defaultValue) {
        super(context, sharedPreferencesName, key, defaultValue);
    }

    public StringPreference(Context context, String sharedPreferencesName, int mode, String key, String defaultValue) {
        super(context, sharedPreferencesName, mode, key, defaultValue);
    }
}
