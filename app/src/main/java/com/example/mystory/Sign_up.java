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

public class Sign_up extends AppCompatActivity {


       TextView nameOfApp,MyStory;
        TextInputEditText email,username,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);




        nameOfApp = findViewById(R.id.nameOfApp);
        MyStory = findViewById(R.id.MyStory);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username );
        password = findViewById(R.id.password);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


        String value = sharedPreferences.getString("fontfamily", "");
        Typeface typeface = ResourcesCompat.getFont(this,fontFamily(value));
        nameOfApp.setTypeface(typeface);
        MyStory.setTypeface(typeface);
        email.setTypeface(typeface);
        username.setTypeface(typeface);
        password.setTypeface(typeface);

    }
}
