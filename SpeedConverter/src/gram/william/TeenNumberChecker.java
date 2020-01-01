package gram.william;

public class TeenNumberChecker {
    public static boolean hasTeen(int optOne, int optTwo, int optThree) {
        return isTeen(optOne) || isTeen(optTwo) || isTeen(optThree);
    }

    public static boolean isTeen(int optTeen) {
        return optTeen >= 13 && optTeen <= 19;
    }
}
