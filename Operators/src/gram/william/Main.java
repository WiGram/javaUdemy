package gram.william;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;  // 1, 2 are literals, and these literals are operands, + being an operator
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);  // does not get updated when result is updated

        // Other operators: *, /
        result = result * 10;  // 2 * 10 = 20
        result = result / 5;  // 20 / 5 = 4

        //  and modulus, %, which gives the remainder, e.g. 3 goes into 4 once, with remainder 1.
        result = result % 3;  // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);  // Could write "..." + 4 % 3

        // result = result + 1 can be abbreviated;
        result++;  // 1 + 1 = 2;
        System.out.println("1 + 1 = " + result);

        result--;

        // result = result + 2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *= 10;  // 3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        boolean isAlien = false;
        // The following, without an ";" is defined as a 'code block'
        if (isAlien == false)
            System.out.println("It is not an alien!");

        if (!isAlien)
            System.out.println("It is not an alien!");

        if (!isAlien){
            System.out.println("It is an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the high score!");
        }

        // Other operators: !=, >=, <=, <, >
        int secondTopScore = 60;

        // bitwise operator & can, but should not be used here
        if (topScore > secondTopScore && topScore < 110){
            System.out.println("Greather than second top score and less than 110");
        }

        // Improve readability - advised
        if ((topScore > secondTopScore) && (topScore < 110)){
            System.out.println("Greather than second top score and less than 110");
        }

        // | is a bit-wise operator, we need a logical-operator || - the results are not generally the same
        if ((topScore > secondTopScore) || (topScore > 110)){
            System.out.println("Greather than second top score or larger than 110");
        }

        boolean newBoolean = false;
        if (!newBoolean){
            System.out.println("Short hand and conventional evaluation");
            System.out.println(newBoolean);
        }
        // Common bug - newBoolean is a boolean, and is reassigned to true in the if-statement
        // Would not work, if newBoolean were e.g. an int, because there would be a type error
        if (newBoolean = true){
            System.out.println("You have accidentally reassigned newBoolean from false to true");
            System.out.println(newBoolean);
        }

        // TERNARY OPERATORS
        boolean isCar = false;
        /* if isCar == true then wasCar = true, else false */
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
        isCar = true;
        /* if isCar == true then wasCar = true, else false */
        wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        // easier example
        int ageOfClient = 20;
        String isEighteenOrOver = ageOfClient == 20 ? "Can buy": "Cannot buy";
        System.out.println("Can person buy alcohol: " + isEighteenOrOver);
    }
}
