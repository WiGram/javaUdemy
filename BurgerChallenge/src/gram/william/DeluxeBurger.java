package gram.william;

public class DeluxeBurger extends Burger {
    private boolean hasDrink = true;

    public DeluxeBurger() {
        super();
    }

    @Override
    public void getBurgerStyle() {
        System.out.println(
                "You have chosen a deluxe burger.");
        this.price += 1.00;
    }

    @Override
    public void getPricingScheme() {
        System.out.println(
                "The deluxe burger has a classic bun, 350 gr patty, all extras" +
                " and a drink and fries. The price is 13.75."
        );
    }

    public void prepareBurger() {
        super.prepareBurger(
                1, 350, true,
                true, true, true, true
        );
    }
}
