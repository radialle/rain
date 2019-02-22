package org.telegram.rain;

import android.content.Context;
import android.content.SharedPreferences;

public class RainPreferences {

    private SharedPreferences preferences;

    public RainPreferences(Context context) {
        preferences = context.getSharedPreferences("org.telegram.messenger.rain", Context.MODE_PRIVATE);
    }

    public void setEnableTypingUpdates(boolean value) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("EnableTypingUpdates", value);
        editor.apply();
    }

    public boolean getEnableTypingUpdates() {
        return preferences.getBoolean("EnableTypingUpdates", true);
    }

}