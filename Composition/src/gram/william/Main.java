package gram.william;

public class Main {

    // Composition - a master object to rule over other objects, as opposed to inheritance
    //   we generally prefer composition to inheritance, even if there are exceptions.
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("2208", "Dell", "240", dimensions);

	    // For the Resolution, we don't need it for anything but the monitor,
        // Consequently we create it "on the fly"
	    Monitor monitor = new Monitor(
	            "27inch Beast",
                "Acer",
                27,
                new Resolution(2540, 1440)
        );

	    Motherboard motherboard = new Motherboard(
	            "BJ-200", "Asus", 4, 6, "v2.44"
        );

	    PC pc = new PC(theCase, monitor, motherboard);

	    pc.powerUp();

	    /*
	    // Now, we want to access the subclasses' methods.
        pc.getMonitor().drawPixelAt(1500, 1200, "red");
        pc.getTheCase().pressPowerButton();
        pc.getMotherboard().loadProgram("Windows 1.0");
	     */
    }
}
