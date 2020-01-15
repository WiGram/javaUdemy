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

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
