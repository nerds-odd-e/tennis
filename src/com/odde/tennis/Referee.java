package com.odde.tennis;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Referee extends Activity {
    private Tennis game;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        this.game = new Tennis();
        TextView score = (TextView)findViewById(R.id.score);
        score.setText(game.getScore());
    }
}
