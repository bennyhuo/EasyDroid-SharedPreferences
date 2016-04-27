package net.println.easydroid.sharedpreferences;

import android.content.Context;

/**
 * Created by benny on 4/27/16.
 */
public class FloatPreference extends PreferenceItem<Float> {
    public static final String TAG = "StringPreference";

    public FloatPreference(Context context, String key) {
        this(context, DEFAULT_PREFERENCE_NAME, key);
    }

    public FloatPreference(Context context, String sharedPreferencesName, String key) {
        super(context, sharedPreferencesName, key, 0f);
    }

    public FloatPreference(Context context, String sharedPreferencesName, String key, float defaultValue) {
        super(context, sharedPreferencesName, key, defaultValue);
    }

    public FloatPreference(Context context, String sharedPreferencesName, int mode, String key, float defaultValue) {
        super(context, sharedPreferencesName, mode, key, defaultValue);
    }
}
