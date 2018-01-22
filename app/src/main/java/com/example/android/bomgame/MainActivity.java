package com.example.android.bomgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int flag1 = 0;
    int flag2 = 0;
    String message;
    int stop = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBomPlayerA(View v) {

        if (flag1 == 0) {
            score = score + 1;
            if (score % 5 == 0) {
                message = score + " : BOM";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
            } else {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
                stop = 1;
            }
            flag1 = 1;
        }
        if (stop == 0)
            flag2 = 0;
    }

    public void displayBomPlayerB(View v) {

        if (flag2 == 0) {
            score = score + 1;
            if (score % 5 == 0) {
                message = score + " : BOM";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
            } else {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
                stop = 1;
            }
            flag2 = 1;
        }
        if (stop == 0)
            flag1 = 0;
    }

    public void scoreCounterA(View v) {

        if (flag1 == 0) {
            score = score + 1;
            if (score % 5 == 0 || score % 7 == 0 || score % 35 == 0) {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
                stop = 1;
            } else {
                displayScoreA(score);
                displayScoreB(score);
            }
            flag1 = 1;
        }
        if (stop == 0)
            flag2 = 0;
    }

    public void scoreCounterB(View v) {

        if (flag2 == 0) {
            score = score + 1;
            if (score % 5 == 0 || score % 7 == 0 || score % 35 == 0) {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
                stop = 1;
            } else {
                displayScoreA(score);
                displayScoreB(score);
            }
            flag2 = 1;
        }
        if (stop == 0)
            flag1 = 0;
    }

    public void displayfizPlayerA(View v) {

        if (flag1 == 0) {
            score = score + 1;
            if (score % 7 == 0 && score % 35 != 0) {
                message = score + " : FIZ";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
            } else {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
                stop = 1;
            }
            flag1 = 1;
        }
        if (stop == 0)
            flag2 = 0;
    }

    public void displayfizPlayerB(View v) {

        if (flag2 == 0) {
            score = score + 1;
            if (score % 7 == 0 && score % 35 != 0) {
                message = score + " : FIZ";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
            } else {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
                stop = 1;
            }
            flag2 = 1;
        }
        if (stop == 0)
            flag1 = 0;
    }

    public void bomFizPlayerA(View v) {

        if (flag1 == 0) {
            score = score + 1;
            if (score % 35 == 0) {
                message = score + " : BOM-FIZ";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
            } else {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_a_score);
                textView.setText(message);
                stop = 1;
            }
            flag1 = 1;
        }
        if (stop == 0)
            flag2 = 0;
    }

    public void bomFizPlayerB(View v) {

        if (flag2 == 0) {
            score = score + 1;
            if (score % 35 == 0) {
                message = score + " : BOM-FIZ";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
            } else {
                message = "You're Lose!";
                TextView textView = (TextView) findViewById(R.id.player_b_score);
                textView.setText(message);
                stop = 1;
            }
            flag2 = 1;
        }
        if (stop == 0)
            flag1 = 0;
    }

    public void resetScore(View v) {
        score = 0;
        flag1 = 0;
        flag2 = 0;
        stop = 0;
        displayScoreA(score);
        displayScoreB(score);
    }
}
