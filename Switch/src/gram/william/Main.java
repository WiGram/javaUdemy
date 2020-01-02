package gram.william;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was neither 1 nor 2");
        }

	    // equivalent (was introduced in Java 7?)
	    int switchValue = 3;
	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                break;
            default:
                System.out.println("Was neither 1 nor 2");
        }

        char switchChar = 'B';
	    switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("An A, B, C, D, or E was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not our kind of month");
                break;
        }
    }
}
