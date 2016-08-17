package com.example.apple.androidquick.manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.apple.androidquick.R;


public class SharedPreferenceManager {
    // Singleton - Start
    private static final SharedPreferenceManager ourInstance = new SharedPreferenceManager();

    public static SharedPreferenceManager getInstance() {
        return ourInstance;
    }

    private SharedPreferenceManager() {
    }

    // Singleton - End
    private SharedPreferences sharedPreferences;

    public void init(Context context) {
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.app_name), Context.MODE_PRIVATE);
    }


    public void putString(String key, String value) {
        (sharedPreferences.edit()).putString(key, value).apply();
    }

    public String getString(String key, String defaultVal) {
        return sharedPreferences.getString(key, defaultVal);
    }

    public void putBoolean(String key, boolean value) {
        (sharedPreferences.edit()).putBoolean(key, value).apply();
    }

    public boolean getBoolean(String key, boolean defaultVal) {
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(key, defaultVal);
        } else {
            return defaultVal;
        }
    }

    public void putInt(String key, int value) {
        (sharedPreferences.edit()).putInt(key, value).apply();
    }

    public int getInt(String key, int defaultVal) {
        return sharedPreferences.getInt(key, defaultVal);
    }

    public void putLong(String key, long value) {
        (sharedPreferences.edit()).putLong(key, value).apply();
    }

    public long getLong(String key, long defaultVal) {
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(key, defaultVal);
        } else {
            return defaultVal;
        }
    }

    public void putFloat(String key, float value) {
        (sharedPreferences.edit()).putFloat(key, value).apply();
    }

    public float getFloat(String key, float defaultVal) {
        if (sharedPreferences != null) {
            return sharedPreferences.getFloat(key, defaultVal);
        } else {
            return defaultVal;
        }
    }

    /**
     * Returns true if any key-value pair with that key
     *
     * @param key Preference key
     * @return true/false
     */
    public boolean contains(String key) {
        return sharedPreferences.contains(key);
    }

    /**
     * Removes key-value pair from sp
     *
     * @param key key of the pair
     */
    public void remove(String key) {
        (sharedPreferences.edit()).remove(key).apply();
    }

    /**
     * Clears whole key-value pairs in sp
     */
    public void clear() {
        sharedPreferences.edit().clear().apply();
    }
}
