package gram.william;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        // First consider row
        for (int i = 1; i<=number; i++) {
            // Next consider column
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number) {
                    System.out.print('*');
                    continue;
                    // Else follow the algorithm
                } else if (j == 1 || j == i ||
                        j == number - i + 1 || j == number) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
