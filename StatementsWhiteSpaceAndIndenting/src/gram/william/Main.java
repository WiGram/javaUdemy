package gram.william;

public class Main {

    public static void main(String[] args) {

        // Expression: myVariable = 50
        // Statement: int myVariable = 50;
	    int myVariable = 50;
	    myVariable++;  // another statement
        myVariable--;
        System.out.println("This is a test");  // In most cases, the ; is what completes a Java line to make it a statement
        System.out.println("This is"  // Good practice is to set the operator at the end of the same line
                + " another" +  // But does not care where the addition sign or comment is
                " still more.");  // Another statement

        int anotherVariable = 50;myVariable--; // Not good practice, but absolutely valid
        System.out.println(myVariable);
        System.out.println("This was suggested to be moved to an individual line");  // In fact IntelliJ automatically moved sout to the next line

        // INDENTING - meant for readability, not necessary.
if (myVariable > 10){
System.out.println("myVariable > 10: " + myVariable); }

        // More readable, but output is the same - in fact IntelliJ pushes indentation itself.
        if (myVariable > 10){
            System.out.println("myVariable > 10: " + myVariable);
        }

        // Go to the Code - menu-tab and to "Reformat Code (Ctrl + Alt + L)" to reformat indentation etc.
    }
}
