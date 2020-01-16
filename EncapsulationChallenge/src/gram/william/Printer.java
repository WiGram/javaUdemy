package gram.william;

public class Printer {
    private double tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex = true;

    public Printer(double tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillToner(double fillAmount) {
        if (fillAmount < 0) {
            System.out.println("Cannot fill negative amounts. Try again with a positive amount.");
        } else if (fillAmount + this.tonerLevel <= 100) {
            this.tonerLevel += fillAmount;
            System.out.println("Your filling was successful, printer at toner level " + this.tonerLevel);
        } else {
            this.tonerLevel = 100;
            System.out.println("You filled too much, toner is now maxed at 100 pct.");
        }
    }

    public void printPages(int pages) {
        if (pages < 0) {
            System.out.println("Can only print positive amount of pages. Try again with a positive number.");
        } else {
            System.out.println("Printing " + pages + " pages.");
            if (this.duplex) {
                System.out.println("You have a duplex printer, printing on both sides of the sheet.");
                pages = (pages / 2) + (pages % 2);
            }
            this.pagesPrinted += pages;
            System.out.println("Sheets printed is now at " + this.pagesPrinted);
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
