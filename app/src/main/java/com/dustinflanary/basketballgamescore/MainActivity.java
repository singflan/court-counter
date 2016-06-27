package com.dustinflanary.basketballgamescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeam1(View v) {
        scoreTeam1 += 1;
        displayForTeam1(scoreTeam1);
    }
    public void addTwoForTeam1(View v) {
        scoreTeam1 += 2;
        displayForTeam1(scoreTeam1);
    }
    public void addThreeForTeam1(View v) {
        scoreTeam1 += 3;
        displayForTeam1(scoreTeam1);
    }

    public void addOneForTeam2(View v) {
        scoreTeam2 += 1;
        displayForTeam2(scoreTeam2);
    }
    public void addTwoForTeam2(View v) {
        scoreTeam2 += 2;
        displayForTeam2(scoreTeam2);
    }
    public void addThreeForTeam2(View v) {
        scoreTeam2 += 3;
        displayForTeam2(scoreTeam2);
    }

    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textViewScoreTeam1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.textViewScoreTeam2);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScores(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }
}
