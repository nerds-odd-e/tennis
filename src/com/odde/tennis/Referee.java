package com.odde.tennis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Referee extends Activity {
    private Tennis game = new Tennis();
    private TextView score;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        score = (TextView)findViewById(R.id.score);
        displayScore();
    }

    private void displayScore() {
        score.setText(game.getScore());
    }

    public void player1Score(View view){
        game.player1Score();
        displayScore();
    }
}
