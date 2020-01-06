package gram.william;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        boolean isEven = isEvenNumber(4);

        int start = 1;
        int end = 20;
        int evenNumbers = 0;
        while (start < end) {
            start++;
            if (!isEvenNumber(start)) {
                // Will make the while loop restart;
                continue;
            }

            evenNumbers++;
            if (evenNumbers == 5) {
                System.out.println("Total of 5 even numbers has been found");
                break;
            }
        }

        int dig = 15;
        SumDigitsChallenge.sumDigits(dig);
        SumDigitsChallenge.sumDigits(125);
    }

    public static boolean isEvenNumber(int start) {
        if (start % 2 == 0) {
            System.out.println(start + " is even");
            return true;
        }
        System.out.println(start + " is uneven");
        return false;
    }
}
