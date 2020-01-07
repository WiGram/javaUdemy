package gram.william;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        int comDiv = 0;
        int greater = Math.max(first, second);

        for (int i = 1; i < greater; i++) {
            if (((first % i) == 0) && ((second % i) == 0)) comDiv = i;
        }
        return comDiv;
    }
}
