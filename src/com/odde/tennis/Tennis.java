package com.odde.tennis;

public class Tennis {
    private int scoreOfPlayer1;
    private static final String[] SCORES = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
    private int scoreOfPlayer2;

    public String getScore() {
        if (isDraw())
            return drawScore();
        return normalScore();
    }

    private String normalScore() {
        return SCORES[scoreOfPlayer1] + " " + SCORES[scoreOfPlayer2];
    }

    private String drawScore() {
        return SCORES[scoreOfPlayer1] + " All";
    }

    private boolean isDraw() {
        return scoreOfPlayer1 == scoreOfPlayer2;
    }

    public void player1Score() {
        scoreOfPlayer1++;
    }

    public void player2Score() {
        scoreOfPlayer2++;
    }
}
