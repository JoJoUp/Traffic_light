package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    ConstraintLayout myConstraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myConstraintLayout = findViewById(R.id.constraintLayout);
    }


    public void clickOnYellowButton(View view) {
        myConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorYellow));
    }

    public void clickOnGreenButton(View view) {
        myConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
    }

    public void clickOnRedButton(View view) {
        myConstraintLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
    }
}
