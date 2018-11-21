import java.util.*;
public class List {
    Node head; // head of list

    /* Doubly Linked list Node*/
    class Node {
        String data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(String d) {
            data = d;
        }
    }

    // Add a node at the end of the list
    void append(String new_data) {
        Node new_node = new Node(new_data);
        Node last = head;
        new_node.next = null;
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        new_node.prev = last;
    }

    // This function prints contents of linked list starting from the given node
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public void areSiblings(Node element1, Node element2) {
        System.out.println("Checking if " + element1 + " and " + element2 + " are siblings");
        Node tmp = head;
        while (tmp != null) {
            if (((tmp == element1) && (tmp.next == element2)) || (((tmp == element2) && (tmp.next == element1))))
                System.out.println("These elements are siblings");
            else
                System.out.println("These elements are not siblings");
        }
        ;
        tmp = tmp.next;
    }

    public static int checkValidNumber() {
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            input.next();
            System.out.print("That  is not a whole number");
            return 0;
        }
    }

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //DoublyLinkedListImpl<String> dll = new DoublyLinkedListImpl<String>();
        System.out.println("How many levels are in your food chain?");
        int number = checkValidNumber();
        if (number != 0) {
            System.out.println("Input " + number + "levels of food chain");
        }
        else {
            System.out.println("There does not exist a chain which consisits of 0 levels");
        }
        List dll = new List();
        dll.append("Plant");
        dll.append("Grasshopper");
        dll.append("Blue Bird");
        dll.append("Snake");
        dll.append("Owl");

    }
}
