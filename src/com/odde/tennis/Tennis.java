package com.odde.tennis;

public class Tennis {
    private int scoreOfPlayer1;
    private static final String[] SCORES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public String getScore() {
        if (scoreOfPlayer1 > 0)
            return SCORES[scoreOfPlayer1] + " " + SCORES[0];
        return SCORES[0] + " All";
    }

    public void player1Score() {
        scoreOfPlayer1 += 1;
    }
}
