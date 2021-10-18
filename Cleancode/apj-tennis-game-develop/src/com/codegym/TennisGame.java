package com.codegym;

public class TennisGame {


    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String compareScoreEqual(int compareScore) {
        String score = "";
        switch(compareScore) {
            case LOVE:
                score += "Love";
                break;
            case FIFTEEN:
                score += "Fifteen";
                break;
            case THIRTY:
                score += "Thirty";
                break;
            case FORTY:
                score += "Forty";
                break;
        }
        return score;
    }

    public static String compareScore(int player1, int player2) {
        String score = "";
        int minusResult = player1 - player2;
        if (minusResult == 1) score ="Advantage player1";
        else if (minusResult == -1) score ="Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = LOVE;
        if (player1Score == player2Score) {
            if (player1Score <= FORTY) {
                score = compareScoreEqual(player1Score) + "-All";
            } else {
                score = "Deuce";
            }
        }
        else if (player1Score > FORTY || player2Score > FORTY) {
            score = compareScore(player1Score, player2Score);

        } else {
            for (int i=1; i<3; i++) {
                if (i==1) tempScore = player1Score;
                else {score += "-"; tempScore = player2Score;}
                score = compareScoreEqual(tempScore);
            }
        }
        return score;
    }
    public static void main(String[] args) {
        System.out.println(getScore("nam", "hoa", 3,2));
    }
}