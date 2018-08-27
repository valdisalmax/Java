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

        String playerName = "Buddy";
        int playerScore = 1000;

        displayHighScorePosition(playerName, calculatedHighScorePosition(playerScore));

        playerScore = 500;
        displayHighScorePosition(playerName, calculatedHighScorePosition(playerScore));

        playerScore = 100;
        displayHighScorePosition(playerName, calculatedHighScorePosition(playerScore));

        playerScore = 50;
        displayHighScorePosition(playerName, calculatedHighScorePosition(playerScore));


    }

    public static void displayHighScorePosition(String playerName, int playerRank)
    {
        System.out.println(playerName + " managed to get into position "
                         + playerRank + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore)
    {
        if (playerScore >=1000)
        {
            int playerRank = 1;
            return playerRank;
        }
        else if (playerScore >= 500 && playerScore < 1000)
        {
            int playerRank = 2;
            return playerRank;
        }
        else if (playerScore >= 100 && playerScore < 500)
        {
            int playerRank = 3;
            return playerRank;
        } else
        {
            int playerRank = 4;
            return playerRank;
        }
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
