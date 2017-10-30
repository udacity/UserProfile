package com.example.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Vicky");

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("9/24/1996");

        TextView school = (TextView) findViewById(R.id.school);
        school.setText("UC Berkeley");
    }
}
