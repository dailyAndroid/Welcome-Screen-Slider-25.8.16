package com.example.hwhong.welcomescreenslider;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by hwhong on 8/25/16.
 */
public class PreferenceMan {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;

    // shared pref mode
    private int MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "welcome-screen";

    private static final String IS_FIRST_TIME_LAUNCH = "firstTime";

    public PreferenceMan(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
