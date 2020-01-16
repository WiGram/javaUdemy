package gram.william;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();

	    // Since we used the public scope, we can access the class fields outside the class
	    player.name = "Bob";
	    player.health = 20;

	    player.loseHealth(10);
	    player.health = 200;
	    player.loseHealth(11);

	    // Two unfortunate consequences of defining fields in a public scope:
		//  1. field properties are no longer controlled within the class alone
		//  2. If fields are called outside the class, and they are later changed inside the class
		//     then there is no overview of where else that field should be changed,
		//     e.g. changing the field "name" to "playerName" would have ripple effects into other
		//     scripts.
		//  3. We may forget to initialise fields, and there are no guarantee that the fields are
		//     well defined.

		EnhancedPlayer player1 = new EnhancedPlayer("Bob", 150, "Sword");
		System.out.println("Enhanced player's initial health is " + player1.getHealth());
    }
}
