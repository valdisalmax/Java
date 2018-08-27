package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a player name as a parameter, and 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position" and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculatedHighScorePosition
        // it should be sent one arguent onlye, the player score
        // it should return an int
        // the return data should be
        // 1. if the score is > 1000
        // 2. if the score is > 500 and < 1000
        // 3. if the score is > 100 and < 500
        // 4. in all other cases
        // Call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //


        displayHighScorePosition("Mira", calculatedHighScorePosition(1500));

        displayHighScorePosition("Ëlmira", calculatedHighScorePosition(900));

        displayHighScorePosition("Dair", calculatedHighScorePosition(400));

        displayHighScorePosition("Buddy", calculatedHighScorePosition(50));

        displayHighScorePosition("Ryuken", calculatedHighScorePosition(1000));

        displayHighScorePosition("Saar", calculatedHighScorePosition(500));

        displayHighScorePosition("Danny", calculatedHighScorePosition(100));

        displayHighScorePosition("Chris", calculatedHighScorePosition(25));


    }

    public static void displayHighScorePosition(String playerName, int playerRank)
    {
        System.out.println(playerName + " managed to get into position "
                         + playerRank + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore)
    {
        if (playerScore >=1000)
            return 1;
        else if (playerScore >= 500 )
            return 2;
        else if (playerScore >= 100 )
            return 3;
        else
            return 4;
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;
    }
}
