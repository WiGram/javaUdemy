package gram.william;

public class Main {

    public static void main(String[] args) {
        // ValuesFromString.emptyMethod();
        FlourPacker.canPack(2, 1, 5);
        System.out.println(LargestPrime.getLargestPrime(34));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(47));

        DiagonalStar.printSquareStar(5);
        DiagonalStar.printSquareStar(8);
    }
}
