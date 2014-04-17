package com.odde.tennis;

public class Tennis {
    private int scoreOfPlayer1;
    private static final String[] SCORES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    private int scoreOfPlayer2;

    public String getScore() {
        if (scoreOfPlayer2 == 1 || scoreOfPlayer1 > 0)
            return SCORES[scoreOfPlayer1] + " " + SCORES[scoreOfPlayer2];
        return SCORES[0] + " All";
    }

    public void player1Score() {
        scoreOfPlayer1++;
    }

    public void player2Score() {
        scoreOfPlayer2++;
    }
}
