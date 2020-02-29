package gram.william;

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

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
                stringListIterator.previous();  // moving back to before next
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on to the next city.
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}
