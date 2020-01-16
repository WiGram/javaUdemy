package gram.william;

public class Player {

    // Here we are using public "scope"
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        System.out.println(this.name + " took " + damage + " damage.");
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        } else {
            System.out.println("Players health at: " + this.health);
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
