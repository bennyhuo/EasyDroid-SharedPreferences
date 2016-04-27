package net.println.easydroid.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by benny on 4/26/16.
 */
class PreferenceItem<T> {
    public static final String TAG = "PreferenceItem";

    protected static final String DEFAULT_PREFERENCE_NAME = "net.println.easydroid.default";

    private T defaultValue;
    private String key;
    private SharedPreferences sp;
    private Method setter;
    private Method getter;

    public PreferenceItem(Context context, String sharedPreferencesName, String key, T defaultValue){
        this(context, sharedPreferencesName, Context.MODE_PRIVATE, key, defaultValue);
    }

    public PreferenceItem(Context context, String sharedPreferencesName, int mode,  String key, T defaultValue){
        sp = context.getSharedPreferences(sharedPreferencesName, mode);
        this.defaultValue = defaultValue;
        this.key = key;
        try {
            if(defaultValue instanceof String){
                setter = SharedPreferences.Editor.class.getDeclaredMethod("putString", String.class, String.class);
                getter = SharedPreferences.class.getDeclaredMethod("getString", String.class, String.class);
            }else if(defaultValue instanceof Integer){
                setter = Editor.class.getDeclaredMethod("putInt", String.class, int.class);
                getter = SharedPreferences.class.getDeclaredMethod("getInt", String.class, int.class);
            }else if(defaultValue instanceof Boolean){
                setter = Editor.class.getDeclaredMethod("putBoolean", String.class, boolean.class);
                getter = SharedPreferences.class.getDeclaredMethod("getBoolean", String.class, boolean.class);
            }else if (defaultValue instanceof Float) {
                setter = Editor.class.getDeclaredMethod("putFloat", String.class, float.class);
                getter = SharedPreferences.class.getDeclaredMethod("getFloat", String.class, float.class);
            }else if(defaultValue instanceof Long){
                setter = Editor.class.getDeclaredMethod("putLong", String.class, long.class);
                getter = SharedPreferences.class.getDeclaredMethod("getLong", String.class, long.class);
            }else if(defaultValue instanceof Double){
                throw new IllegalArgumentException("Double is not supported.");
            }else{
                throw new IllegalArgumentException(defaultValue.getClass().getName() + " is not supported.");
            }
            setter.setAccessible(true);
            getter.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public T val(){
        try {
            return (T) getter.invoke(sp, key, defaultValue);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    public boolean set(T val){
        try {
            Editor editor = sp.edit();
            setter.invoke(editor, key, val);
            return editor.commit();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }
}
