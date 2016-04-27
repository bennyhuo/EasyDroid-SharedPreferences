package net.println.easydroid.sharedpreferences;

import android.content.Context;

/**
 * Created by benny on 4/27/16.
 */
public class LongPreference extends PreferenceItem<Long> {
    public static final String TAG = "StringPreference";

    public LongPreference(Context context, String key) {
        this(context, DEFAULT_PREFERENCE_NAME, key);
    }

    public LongPreference(Context context, String sharedPreferencesName, String key) {
        super(context, sharedPreferencesName, key, 0l);
    }

    public LongPreference(Context context, String sharedPreferencesName, String key, long defaultValue) {
        super(context, sharedPreferencesName, key, defaultValue);
    }

    public LongPreference(Context context, String sharedPreferencesName, int mode, String key, long defaultValue) {
        super(context, sharedPreferencesName, mode, key, defaultValue);
    }
}
