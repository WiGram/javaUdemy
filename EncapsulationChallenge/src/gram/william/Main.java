package gram.william;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(95.17, true);
	    printer.fillToner(3);
	    printer.printPages(15);
	    printer.printPages(16);
    }
}
