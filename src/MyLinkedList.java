import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");
        linkedList.add("Last");

        System.out.println("getFirst(): " + linkedList.getFirst());
        System.out.println("getLast(): " + linkedList.getLast());

        System.out.println("\nbefore removeFirst() and removeLast(): " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("after removeFirst() and removeLast(): " + linkedList);

        linkedList.addFirst("New First");
        linkedList.addLast("New Last");
        System.out.println("\nafter addFirst() and addLast(): " + linkedList);
    }
}

// ArrayList vs LinkedList (W3Schools.com)

// - How the ArrayList works -
// The ArrayList class has a regular array inside it. When an element is added,
// it is placed into the array.
// If the array is not big enough, a new, larger array is created to replace the
// old one and the old one is removed.

// - How the LinkedList works -
// The LinkedList stores its items in "containers." The list has a link to the
// first container and each container has a link to the next container in the
// list.
// To add an element to the list, the element is placed into a new container and
// that container is linked to one of the other containers in the list.

// ? When To Use ?
// Use an ArrayList for storing and accessing data
// and LinkedList to manipulate data.