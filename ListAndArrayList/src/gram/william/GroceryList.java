package gram.william;

import java.util.ArrayList;

public class GroceryList {
    // Different from initialising an int:
    //   private int[] myNumbers;

    // The elements of the AL are of type String. The "()" indicate we are
    //  calling an empty constructor.
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

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

    // Overloaded mgi-method
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // We are now forcing users to use the overloaded method, by making this private
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    /*
    public String findItem(String searchItem) {

        // contains is a built-in method for ArrayLists
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0)
            return groceryList.get(position);


        // note we only reach this return statement if position < 0
        return null;
    }
     */
}
