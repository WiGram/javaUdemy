package gram.william;

public class Main {

    public static void main(String[] args) {
	    Burger burger = new Burger();
	    burger.prepareBurger(
	            1, 250, true, true,
                true, true, true);
	    burger.finishOrder();

	    HealthyBurger healthy_burger = new HealthyBurger();
        healthy_burger.prepareBurger(
                2, 350, true, true,
                true, true, true, true
        );
        healthy_burger.finishOrder();

        DeluxeBurger dburger = new DeluxeBurger();
        dburger.prepareBurger();
        dburger.finishOrder();

        EnhancedBurger eburger = new EnhancedBurger();
        eburger.itemizeBurger();
        System.out.println(eburger.getAdditionOne());
    }
}
