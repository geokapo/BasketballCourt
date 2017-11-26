package com.example.android.basketballcourt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePanathinaikos = 0;
    int scoreRealMadrid = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPanathinaikos(0);

    }



    /**
     * Displays the given score for Panathinaikos.
     */
    public void displayPanathinaikos(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Panathinaikos by 3 points.
     */
    public void addThreeForPanathinaikos(View view) {
        scorePanathinaikos = scorePanathinaikos + 3;
        displayPanathinaikos(scorePanathinaikos);

    }

    /**
     * Increase the score for Panathinaikos by 2 points.
     */
    public void addTwoForPanathinaikos(View view) {
        scorePanathinaikos = scorePanathinaikos + 2;
        displayPanathinaikos(scorePanathinaikos);
    }

    /**
     * Increase the score for Panathinaikos by 1 points.
     */
    public void addOneForPanathinaikos(View view) {
        scorePanathinaikos = scorePanathinaikos + 1;
        displayPanathinaikos(scorePanathinaikos);
    }

    /**
     * Increase the score for Real Madrid by 1 points.
     */

    public void addOneForRealMadrid(View view) {
        scoreRealMadrid = scoreRealMadrid + 1;
        displayForRealMadrid(scoreRealMadrid);
    }

    /**
     * Increase the score for Real Madrid by 2 points.
     */

    public void addTwoForRealMadrid(View view) {
        scoreRealMadrid = scoreRealMadrid + 2;
        displayForRealMadrid(scoreRealMadrid);
    }

    /**
     * Increase the score for Real Madrid by 3 points.
     */
    public void addThreeForRealMadrid(View view) {
        scoreRealMadrid = scoreRealMadrid + 3;
        displayForRealMadrid(scoreRealMadrid);
    }

    /**
     * Reset the score to zero for both of teams.
     */

    public void resetButton(View view) {
        scorePanathinaikos = 0;
        scoreRealMadrid = 0;
        displayPanathinaikos(scorePanathinaikos);
        displayForRealMadrid(scoreRealMadrid);
    }
    }
