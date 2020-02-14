package gram.william;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

	    // String is a class, not a primitive type
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");  // Adds object of type String to arraylist

        //  Can't do an arraylist of primitive types.
        // ArrayList<Int> intArrayList = new ArrayList<Int>();

        // Instead we can make a class of type int which is not primitive
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // We can use an object wrapper for a class
        Integer integer = new Integer(54);
        Double doubleValue = new Double(54.12);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<=10; i++) {
            // valueOf takes the primitive type int value of i and turns it into that of a integer class
            intArrayList.add(Integer.valueOf(i));  // auto-boxing
        }

        for (int i=0; i<=10; i++) {
            // Unboxing - taking it from the object wrapper and return it to primitive type
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // Integer.valueOf(56); is what is run at compile-time, new not needed as it usually is for classes
        Integer myIntValue = 56;

        // myInt.intValue(); is done automatically by java at compile-time
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        // Autoboxing
        for (double dbl = 0.0; dbl<= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        // Unboxing
        for (int i = 0; i<myDoubleValues.size(); i++) {
            // Get the value at index i and convert to doubleValue
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        // OR

        for (double dbl = 0.0; dbl<= 10.0; dbl += 0.5) {
            // Java does Double.valueOf() automatically behind the scenes
            myDoubleValues.add(dbl);
        }

        for (int i = 0; i<myDoubleValues.size(); i++) {
            // Java does the .doubleValue() behind the scenes, automatically
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}

// Create our own class, but this is not the optimal
// In essence, we have created a wrapper for an int-type, i.e. wrapped it inside a class,
// allowing us to use for ArrayList. Java has many wrappers built-in -- easier!
class IntClass {
    private int myValue;

    // Constructor
    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}