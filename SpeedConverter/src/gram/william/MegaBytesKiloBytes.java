package gram.william;

public class MegaBytesKiloBytes {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder = kiloBytes % 1024;
            int megabytes = (kiloBytes - remainder) / 1024;
            System.out.println(
                    kiloBytes + " KB = " + megabytes +
                            " MB and " + remainder + " KB"
            );
        }
    }
}
