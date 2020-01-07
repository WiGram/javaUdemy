package gram.william;

public class SharedDigit {
    public static boolean hasSharedDigit(int n1, int n2) {
        if ( (n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)) return false;

        int n1Last = n1 % 10;
        int n1First = (n1 / 10) % 10;
        System.out.println("n1First = " + n1First + " and n1Last = " + n1Last);

        int n2Last = n2 % 10;
        int n2First = (n2 / 10) % 10;
        System.out.println("n2First = " + n2First + " and n2Last = " + n2Last);

        if (n1First == n2First || n1Last == n2First ||
                n1First == n2Last || n1Last == n2Last) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static boolean hasSharedDigit2(int n1, int n2) {
        if ( (n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)) return false;

        int n1_rem = 0;
        int n2_rem = 0;
        int n2_old = n2;

        while(n1 > 0) {
            n1_rem = n1 % 10;
            n1 /= 10;
            System.out.println("n1_rem is " + n1_rem);
            n2 = n2_old;

            while (n2 > 0) {
                n2_rem = n2 % 10;
                n2 /= 10;
                System.out.println("n2_rem is " + n2_rem);
                System.out.println("matching number is " + (n1_rem == n2_rem));
                if (n1_rem == n2_rem) return true;
            }
        }
        return false;

    }
}
