package com.odde.tennis;

public class Tennis {
    private int scoreOfPlayer1;

    public String getScore() {
        if (scoreOfPlayer1 == 15)
            return "Fifteen Love";
        return "Love All";
    }

    public void player1Score() {
        scoreOfPlayer1 = 15;
    }
}
