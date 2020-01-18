package gram.william;

public class Burger {
    private int bunType = 1;
    private int meatSize = 250;
    private boolean hasLettuce=false;
    private boolean hasTomatoes=false;
    private boolean hasPickles=false;
    private boolean hasCheese=false;
    private boolean hasBacon=false;
    protected double price=11.00;

    public Burger() {
        this.getBurgerStyle();
        this.getPricingScheme();
    }

    public void getPricingScheme() {
        this.getStandardPrice();
        this.getBunPrice();
        this.getMeatPrice();
        this.getExtrasPrice();
    }

    public void getBurgerStyle() {
        System.out.println("You have chosen our standard burger.");
    }

    public void getStandardPrice() {
        System.out.println(
                "This type of burger with a classic bun, 250 gr patty " +
                "and no extras costs " + this.price);
    }

    public void getBunPrice() {
        System.out.println(
                "Choose 1 for classic bun, 2 for cheese topped bun at an additional cost " +
                        "of 0.25, or 3 for honey baked bun at an additional cost of 0.25.");
    }

    public void getMeatPrice() {
        System.out.println(
                "Choose a meat patty of 250 gr or a larger patty of 350 gr at an " +
                        "additional cost of 0.50.");
    }

    public void getExtrasPrice() {
        System.out.println(
                "Choose lettuce, tomatoes, pickles, cheese or bacon at an additional cost " +
                        " of 0.25 per ingredient type.");
    }

    public void prepareBurger(
            int bunType, int meatSize, boolean lettuce, boolean tomatoes,
            boolean pickles, boolean cheese, boolean bacon) {
        this.bunPrice(bunType);
        this.meatPrice(meatSize);
        this.extrasPrice(lettuce, tomatoes, pickles, cheese, bacon);
    }

    public void finishOrder() {
        System.out.println("Your burger costs: " + this.price);
    }

    private void bunPrice(int bunType) {
        this.bunType = bunType;
        switch (bunType) {
            case 1:
                this.price += 0.00;
                break;
            case 2: case 3:
                this.price += 0.25;
                break;
            default:
                this.price += 0.00;
                this.bunType = 1;
                System.out.println("Bun type defaulted to type classic.");
                break;
        }
    }

    private void meatPrice(int meatSize) {
        System.out.println("You chose a patty of size " + meatSize + " grams.");
        this.meatSize = meatSize;
        switch (meatSize) {
            case 250:
                this.price += 0.00;
                break;
            case 350:
                this.price += 0.50;
                break;
            default:
                this.meatSize = 250;
                this.price += 0.00;
                System.out.println("Meat size defaulted to 250 grams.");
                break;
        }
    }

    private void extrasPrice(boolean lettuce, boolean tomatoes, boolean pickles,
                            boolean cheese, boolean bacon
    ) {
        this.hasLettuce = lettuce;
        this.hasTomatoes = tomatoes;
        this.hasPickles = pickles;
        this.hasCheese = cheese;
        this.hasBacon = bacon;

        if (this.hasLettuce) {
            this.price += 0.25;
            System.out.println("Lettuce added for 0.25");
        }
        if (this.hasCheese) {
            this.price += 0.25;
            System.out.println("Cheese added for 0.25");
        }
        if (this.hasPickles) {
            this.price += 0.25;
            System.out.println("Pickles added for 0.25");
        }
        if (this.hasTomatoes) {
            this.price += 0.25;
            System.out.println("Tomatoes added for 0.25");
        }
        if (this.hasBacon) {
            this.price += 0.25;
            System.out.println("Bacon added for 0.25");
        }
    }

    public int getBunType() {
        return bunType;
    }

    public int getMeatSize() {
        return meatSize;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasTomatoes() {
        return hasTomatoes;
    }

    public boolean hasPickles() {
        return hasPickles;
    }

    public boolean hasCheese() {
        return hasCheese;
    }

    public boolean hasBacon() {
        return hasBacon;
    }
}
