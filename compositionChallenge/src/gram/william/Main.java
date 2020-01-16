package gram.william;

public class Main {

    public static void main(String[] args) {
	    Room room = new Room(
                new Table("Round", 4, true),
	            new Wardrobe("Ikea", 150, 230, 45, false),
                new TV(55, false),
                new Wall("North", "Green", 2, 4),
                new Wall("North", "Green", 2, 2),
                new Wall("North", "White", 2, 2),
                new Wall("North", "White", 2, 4)
        );

	    room.tidyRoom();
	    room.getDimension(4);
    }
}
