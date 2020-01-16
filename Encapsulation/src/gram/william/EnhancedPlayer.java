package gram.william;

public class EnhancedPlayer {

    // By making our fields private, we are making sure the fields are inaccessible to classes outside
    // this is the definition of encapsulation
    private String playerName;

    // Shift + F6 allows to change the field throughout the script
    // - the benefit is, we can change anything inside this class with no consequence to anything outside
    //   when we have used encapsulation.
    private int hitPoints = 100;  // default value
    private String weapon;

    public EnhancedPlayer(String playerName, int hitPoints, String weapon) {
        this.playerName = playerName;
        if (hitPoints > 0 && hitPoints <= 100) {
            // if we are outside this accepted range, then the player starts with default health value 100;
            System.out.println("Suggested initial health outside legal range. Health defaulted to 100");  // doesn't work
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        System.out.println(this.playerName + " took " + damage + " damage.");
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
        } else {
            System.out.println("Players health at: " + this.hitPoints);
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
