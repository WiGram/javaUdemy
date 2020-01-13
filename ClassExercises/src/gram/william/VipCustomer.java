package gram.william;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("William", 1000.00, "will.1000@1000.will");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "will.1000@1000.willl");
    }

    // The first two constructors call the below constructor.. The below
    //   constructor is the only one that actually does anything.
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
