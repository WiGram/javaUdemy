package gram.william;

import java.util.ArrayList;

public class GroceryList {
    // Different from initialising an int:
    //   private int[] myNumbers;

    // The elements of the AL are of type String. The "()" indicate we are
    //  calling an empty constructor.
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        // normally we would save an element into an array by using:
        //   newArray[x] = y;

        groceryList.add(item);  // the AL has all the functionality of saving into memory etc.
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i=0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ", " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}
