package com.travisgray.foodchain;


import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn,btnSignUp;
    TextView txtSlogan,logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);

        txtSlogan = (TextView) findViewById(R.id.txtSlogan);
        logo = (TextView) findViewById(R.id.logo);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btnSignIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {



            }
        });
    }
}
