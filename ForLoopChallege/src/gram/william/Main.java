package gram.william;

public class Main {

    public static void main(String[] args) {
	    int partSum = 0;
	    int counter = 0;
        for (int i = 1; i < 1001; i++) {
	        if (i % 3 == 0 && i % 5 == 0){
	            partSum += i;
	            counter += 1;
                System.out.println(i);
            }
	        if (counter == 5) break;
        }
        System.out.println("sum is: " + partSum);

        int oddSum = sumOdd(1, 100);
        System.out.println(oddSum);
    }

    public static boolean isOdd(int number) {
        if (number <= 0) return false;
        if ((number + 1) % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        }

        int oddSum = 0;
        boolean itIsOdd = false;
        for (int i = start; i <= end; i++) {
            itIsOdd = isOdd(i);
            if (itIsOdd) {
                oddSum += i;
            }
        }
        return oddSum;
    }
}
