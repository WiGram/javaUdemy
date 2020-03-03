package gram.william;

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        visit(placesToVisit);

        /*
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        // Testing linkedList:
        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

         */
    }

    private static void printList(LinkedList<String> linkedList){
        // Equivalent to a for loop
        Iterator<String> i = linkedList.iterator();

        // A linked list entry points to another element in the linked list
        //  -- while an element is pointing to something else, i.e.
        //   while the element has a next element, we continue.
        //   i.next() shows the element and then goes to the next element,
        //   pointed to in the linked list
        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }

        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            // .next returns the current entry and moves to the next
            int comparison = stringListIterator.next().compareTo(newCity);  // returns the integer
            // 0 means that the new variable, newCity, is equal to the next element in the iterator
            if (comparison == 0) {
                // equal - do not add
                System.out.println(newCity + " is already included as a destination");
                return false;  // wasn't successfully added.
            } else if (comparison > 0) {
                // newCity should appear before this one
                // Brisbane --> Adelaide (newCity)
                stringListIterator.previous();  // moving back to before next - possible because Java stores a reference to previous item also - not just next item
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to the next city.
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        // Check if the linked list has any elements
        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
        } else {
            // .next() moves to the next entry
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // Clears the input line after entered digit

            switch (action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                // 1 - go to next city
                case 1:
                    // if not going forward and next exists - change direction
                    if (!goingForward) {
                        if (listIterator.hasNext()) listIterator.next();  // changes direction
                        goingForward = true;  // tells us we've changed direction
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached end of the list");
                        goingForward = false;  // we won't be going forward when at end
                    }
                    break;
                // 2 - go to previous city
                case 2:
                    // if going forward and previous exists - change direction
                    if (goingForward) {
                        if (listIterator.hasPrevious()) listIterator.previous();  // changes direction
                        goingForward = false;  // tells us we've changed direction
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at start of the list");
                        goingForward = true;  // can only go forward when at beginning
                    }
                    break;
                // 3 - print menu options
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n press ");
        System.out.println(
                "0 - to quit \n" +
                "1 - go to next city \n " +
                "2 - go to previous city \n " +
                "3 - print menu options"
                );
    }
}
