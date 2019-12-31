package gram.william;

public class Main {

    public static void main(String[] args) {
	// String is NOT a primitive type, but instead is a Class
        String myString = "This is a string";  // Looks very much like a primitive type
        System.out.println("myString is equal to " + myString);
        myString = myString + " and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;  // Java converts the int to a string, and then appends the latter to the former
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString is equal to " + lastString);

        // Strings in Java are immutable - they cannot be changed.
        // Instead, they can get replaced (old deleted, new generated myString = myString + ...)
    }
}
