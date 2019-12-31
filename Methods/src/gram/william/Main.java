package gram.william;

public class Main {

    // The main is a method in itself
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        // The first method generates its own, local variables, the second takes in variables.
        calculateScore();
        calculateScore2(gameOver, score, levelCompleted, bonus);
        int finalScore = calculateScore3(gameOver, score, levelCompleted, bonus);
        System.out.println("The method worked and returned = " + finalScore);

        String playerName = "William";
        int playerScore = 1000;
        displayHighScorePosition(playerName, playerScore);
        displayHighScorePosition(playerName, 900);
        displayHighScorePosition(playerName, 400);
        displayHighScorePosition(playerName, 50);
        // To not have to repeat yourself, make the calculation within a method
    }

    // We will talk about keywords later
    public  static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    // The below method is not returning anything due to the keyword "void"
    // Do not mistake "return" for "printing". It prints to the console, but returns nothing.
    public static void calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    // Replacing void with a data type relevant to what is wanted to return
    // Saying that the method will return an int means it must ALWAYS return an int
    public static int calculateScore3(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            // If we only return inside the if-statement, sometimes nothing is returned by this method - this is an error
            return finalScore;
            // We must thus allow for a return in case the if-statement evaluates to false and returns nothing
            // However, since the return statement breaks the method, we don't even need an else-statement
        }
        return -1;
    }

    /*
    CHALLENGE
    method: displayHighScorePosition
    input: String playerName, int playerPosition
    print: "{playerName} managed to get into position {playerPosition} on the highScore table"

    method: calculateHighScorePosition
    input: int playerScore
    return: int playerScore
    1 if the score is > 1000
    2 if the score is >500 and < 1000
    3 if the score is > 100 and < 500
    4 else..

    Test: using a score of 1500, 900, 400, 50
     */

    public static void displayHighScorePosition(String playerName, int playerScore){
        int playerPosition = calculateHighScorePosition(playerScore);
        System.out.println(playerName + " managed to get into position " + playerPosition +
                " on the high score table, with a score of " + playerScore);
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
