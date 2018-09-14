package com.bhagyawant.quickprefs;

import android.content.Context;
import android.content.SharedPreferences;


public class QuickPref {

    private static SharedPreferences sharedPreferences;

    public static void putBoolean(Context context, String preferenceName, String key, boolean value) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        sharedPreferences.edit().putBoolean(key, value).apply();
    }

    public static boolean getBoolean(Context context, String preferenceName, String key, boolean defaultValue) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, defaultValue);
    }


    public static void putString(Context context, String preferenceName, String key, String value) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(key, value).apply();
    }

    public static String getString(Context context, String preferenceName, String key, String defaultValue) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }


    public static void putInt(Context context, String preferenceName, String key, int value) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        sharedPreferences.edit().putInt(key, value).apply();
    }


    public static int getInt(Context context, String preferenceName, String key, int value) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, value);
    }

    public static void putLong(Context context, String preferenceName, String key, long value) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        sharedPreferences.edit().putLong(key, value).apply();
    }

    public static long getLong(Context context, String preferenceName, String key, long defValue) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(key, defValue);
    }

    public static void clearSharePreferences(Context context, String preferenceName) {
        sharedPreferences = context.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().apply();
    }

}
