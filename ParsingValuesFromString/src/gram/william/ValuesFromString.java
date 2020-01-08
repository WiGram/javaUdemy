package gram.william;

public class ValuesFromString {
    public static void emptyMethod() {
        // String numberAsString = "2018a";  // won't work - not valid number format
        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        int intNumber = Integer.parseInt(numberAsString);
        System.out.println("intNumber = " + intNumber);
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        // intNumber = Integer.parseInt(numberAsString); // won't work due to illegal number format
        // System.out.println("intNumber = " + intNumber);
        number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
