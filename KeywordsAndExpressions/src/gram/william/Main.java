package gram.william;

public class Main {

    public static void main(String[] args) {
        // expression is the part "kilometers = 100 * ... " without the ;
        double kilometers = 100 * 1.609344;  // one mile is 1.609344 kms

        // "score = 50" is the expression, again without ";" and without "int"
        int score = 50;
        if (score > 99){
            // "You've got the high score!" is the expression, including "" but without () and ;
            System.out.println("You've got the high score!");
            // score = 0 without ";" is again a statement
            score = 0;
        }

    }
}
