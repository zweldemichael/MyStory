package com.example.mystory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.mystory.MainActivity.fontFamily;

public class Login extends AppCompatActivity {

    TextView nameOfApp,MyStory,textAccount;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        nameOfApp = findViewById(R.id.nameOfApp);
        MyStory = findViewById(R.id.MyStory);
        textAccount = findViewById(R.id.textAccount);



        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


        String value = sharedPreferences.getString("fontfamily", "");
        Typeface typeface = ResourcesCompat.getFont(this,fontFamily(value));
        nameOfApp.setTypeface(typeface);
        MyStory.setTypeface(typeface);
        textAccount.setTypeface(typeface);

    }
}
