/* *****************************************************************************
 *  Name: William Gram
 *  Date: March 01, 2020
 *  Description: Solve Percolation problem
 **************************************************************************** */

public class Percolation {
    private int n;


    public Percolation(int n) {
        this.n = n;

        if (n < 0) throw new IllegalArgumentException();

    }

    public void open(int row, int col) {
        return;
    }

    public boolean isOpen(int row, int col) {
        return true;
    }

    public boolean isFull(int row, int col) {
        return true;
    }

    public int numberOfOpenSites() {
        return 1;
    }

    public boolean percolates() {
        return true;
    }


    public static void main(String[] args) {

    }
}
