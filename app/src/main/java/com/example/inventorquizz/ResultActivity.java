package com.example.inventorquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    Button btPlayAgain,btPlayScreen;
    TextView txtTotalQuesion,txtCoins,txtWrongQues,txtCorrectQues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btPlayAgain = findViewById(R.id.bt_PlayAgainR);


        txtCoins = findViewById(R.id.txtScoreR);
        txtCorrectQues = findViewById(R.id.txtCorrectR);
        txtWrongQues = findViewById(R.id.txtWrongR);
        txtTotalQuesion = findViewById(R.id.txtTotalQuestionsR);



        Intent intent = getIntent();

        int totalQuestions = intent.getIntExtra(Constant.TOTAL_QUESTIONS,0);
        int coins = intent.getIntExtra(Constant.SCORE,0);
        int correct = intent.getIntExtra(Constant.CORRECT,0);
        int wrong = intent.getIntExtra(Constant.WRONG,0);
        final String categoryValue = intent.getStringExtra("Lvl");


        txtTotalQuesion.setText(String.valueOf(totalQuestions));
        txtCoins.setText(String.valueOf(coins));
        txtCorrectQues.setText(String.valueOf(correct));
        txtWrongQues.setText(String.valueOf(wrong));


        btPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(ResultActivity.this,SetsActivity.class);

                startActivity(intent);
                finish();


            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ResultActivity.this, SetsActivity.class);
        startActivity(intent);
        finish();
    }
}