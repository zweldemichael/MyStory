package com.example.mystory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import static com.example.mystory.MainActivity.fontFamily;

public class Search extends AppCompatActivity {

TextView profileName;
    TextInputEditText search_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        profileName = findViewById(R.id.profileName);

        search_bar = findViewById(R.id.search_bar);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        String value = sharedPreferences.getString("fontfamily", "");
        Typeface typeface = ResourcesCompat.getFont(this,fontFamily(value));
        profileName.setTypeface(typeface);

        search_bar.setTypeface(typeface);


    }
}
