package com.example.customlibrary;

import android.content.Context;
import android.widget.Toast;

public class CustomLibrary {
    public static final String STRING = "I will be successful!";

    public void print(Context context, String STRING) {
        Toast.makeText(context, STRING, Toast.LENGTH_SHORT).show();
    }
}
