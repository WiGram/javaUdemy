package gram.william;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        newScore = calculateScore(1500);
        System.out.println("New score is " + newScore);
        calculateScore();

        int feet = 6;
        int inches = 6;
        double cm = calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm.");

        inches += inches *12;
        cm = calcFeetAndInchesToCentimeters(inches);
        System.out.println(inches + " inches = " + cm + "cm.");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // We set out to OVERLOAD the previous method - here we change the amount of inputs
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // Unique signature definition: name and parameter types and amount
    // The overall signature is NOT changed, if only the return type is changed.
    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    /*
    CHALLENGE
     */

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet <0 || (inches < 0 || inches > 12)) return -1;
        inches += 12 * feet;
        return inches * 2.54d;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) return -1;
        int newInches = inches % 12;
        int feet = (inches - newInches) / 12;
        return calcFeetAndInchesToCentimeters(feet, newInches);
    }
}
