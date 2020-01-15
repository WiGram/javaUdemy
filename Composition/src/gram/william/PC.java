package gram.william;

public class PC {
    // Instead of extending, we are using composition
    // i.e. the PC comprises of these three other classes
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // This is Composition in the real
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {

        // Could make do with theCase. - see drawLogo method below
        //getTheCase().pressPowerButton();
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphics here - we don't know how to do this yet

        // We don't need this. - there is no ambiguity here since no inputs to the function exists
        // We don't need getMonitor() - monitor. has the same method
        this.monitor.drawPixelAt(1200, 50, "yellow");
    }

    /*
    // The example from drawLogo shows we don't need getters.
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
     */
}
