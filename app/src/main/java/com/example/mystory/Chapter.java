package com.example.mystory;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.preference.PreferenceManager;

import android.view.View;
import android.widget.TextView;

import static com.example.mystory.MainActivity.fontFamily;

public class Chapter extends AppCompatActivity {

    TextView chapterTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        chapterTextView = findViewById(R.id.chapterTextView);



        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


        String value = sharedPreferences.getString("fontfamily", "");
        Typeface typeface = ResourcesCompat.getFont(this,fontFamily(value));
        chapterTextView.setTypeface(typeface);

    }
}
