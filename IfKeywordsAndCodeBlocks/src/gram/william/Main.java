package gram.william;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        // Don't need the curly braces {} if we only have one line
        if (score == 5000)
            System.out.println("Your score was 5000");

        // In fact we can do all inline, not conventional, though.
        if (score != 5000) System.out.println("Your score was not 5000, not printed");

        if (score < 5000) {
            System.out.println("YOur score was less than 5000");
        } else if (score > 5000) {
            System.out.println("Your score was above 5000");
        } else {
            System.out.println("Your score was 5000");
        }

        score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver){
            // variables inside code blocks is called "scope"
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Variables created in the if-code block cannot be accessed outside the code block
        // System.out.println(finalScore);

        /*
        CHALLENGE
        Print out a second score on the screen with the following
        1. Score set to 10,000
        2. levelCompleted set to 8
        3. Bonus set to 200
        4. Make sure the first printout above is not affected
        */

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
