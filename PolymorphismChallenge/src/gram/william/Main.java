package gram.william;

public class Main {

    public static void main(String[] args) {
	    Ferrari red = new Ferrari(12, 4, "812 GTS", "red");
		Ford falcon = new Ford(6, 4, "Falcon", "Silver");
	    Kia picanto = new Kia(3, 4, "blue");

	    red.accelerate(100);
		falcon.accelerate(100);
	    picanto.accelerate(100);

    }
}
