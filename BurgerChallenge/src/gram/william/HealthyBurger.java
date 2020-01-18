package gram.william;

public class HealthyBurger extends Burger {
    private boolean avocado = false;;

    public HealthyBurger() {
        super();
    }

    public void prepareBurger(
            int bunType, int meatSize, boolean lettuce, boolean tomatoes,
            boolean pickles, boolean cheese, boolean bacon, boolean avocado) {
        super.prepareBurger(bunType, meatSize, lettuce, tomatoes, pickles, cheese, bacon);
        this.addAvocado(avocado);
    }

    @Override
    public void getBurgerStyle() {
        System.out.println("You have chosen a healthy burger. The bun is from dark bread " +
                "and you get to choose if you want avocado.");
        this.price += 1.00;
    }

    @Override
    public void getExtrasPrice() {
        super.getExtrasPrice();
        System.out.println("Avocado may be chosen at an additional 0.50.");
    }

    private void addAvocado(boolean avocado) {
        this.avocado = avocado;
        if (avocado) {
            System.out.println("You have added avocado at an additional 0.50.");
            this.price += 0.50;
        }
    }

    public boolean hasAvocado() {
        return this.avocado;
    }
}
