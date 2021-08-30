package com.example.inventorquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class SetsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLvl1, btnLvl2, btnLvl3, btnLvl4, btnLvl5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);

        btnLvl1 = findViewById(R.id.set1);
        btnLvl2 = findViewById(R.id.set2);
        btnLvl3 = findViewById(R.id.set3);
        btnLvl4 = findViewById(R.id.set4);
        btnLvl5 = findViewById(R.id.set5);


        btnLvl1.setOnClickListener(this);
        btnLvl2.setOnClickListener(this);
        btnLvl3.setOnClickListener(this);
        btnLvl4.setOnClickListener(this);
        btnLvl5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.set1:
                Intent intentLvl1 = new Intent(SetsActivity.this,QuizActivity.class);
                intentLvl1.putExtra("Lvl",QuizModel.Level_1);
                startActivity(intentLvl1);
                finish();
                break;


            case R.id.set2:
                Intent intentLvl2 = new Intent(SetsActivity.this,QuizActivity.class);
                intentLvl2.putExtra("Lvl",QuizModel.Level_2);
                startActivity(intentLvl2);
                finish();
                break;


            case R.id.set3:
                Intent intentLvl3 = new Intent(SetsActivity.this,QuizActivity.class);
                intentLvl3.putExtra("Lvl",QuizModel.Level_3);
                startActivity(intentLvl3);
                finish();
                break;



            case R.id.set4:
                Intent intentLvl4 = new Intent(SetsActivity.this,QuizActivity.class);
                intentLvl4.putExtra("Lvl",QuizModel.Level_4);
                startActivity(intentLvl4);
                finish();
                break;


            case R.id.set5:
                Intent intentLvl5 = new Intent(SetsActivity.this,QuizActivity.class);
                intentLvl5.putExtra("Lvl",QuizModel.Level_5);
                startActivity(intentLvl5);
                finish();
                break;
        }
    }


//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(LevelsActivity.this,PlayScreen.class);
//        startActivity(intent);
//        finish();
//    }
}