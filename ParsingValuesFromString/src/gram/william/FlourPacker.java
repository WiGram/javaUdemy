package gram.william;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int bigAmount = bigCount * 5;
        while (bigCount > 0) {
            if (goal >= 5) goal -= 5;
            bigCount--;
            bigAmount -= 5;
        }
        return bigAmount + smallCount >= goal;
    }
}
