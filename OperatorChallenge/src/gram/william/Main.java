package gram.william;

public class Main {

    public static void main(String[] args) {
		/*
			1. Create a double variable with a value of 20.00
			2. Create a double variable with a value of 80.00
			3. Add the numbers together
			4. Multiply by 100
			5. Use the remainder operator on 4 using value 40.00
			6. Create a boolean variable of true if the remainder in 5. is zero
			7. Output the boolean variable in a sout
			8. Write an if-then statement with false providing a comment:
				- "Got some remainder"
		*/
		double myFirstDouble = 20.00d;
		double mySecondDouble = 80.00d;
		double mySum = (myFirstDouble + mySecondDouble) * 100d;
		System.out.println(mySum);

		double myDivision = mySum / 40.00;
		System.out.println(myDivision);

		double myRemainder = mySum % 40.00d;
		boolean isZero = myRemainder == 0.00d;
		System.out.println(isZero);

		if (!isZero){
			System.out.println("Got some remainder");
		}
    }
}
