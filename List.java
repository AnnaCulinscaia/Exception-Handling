
// A complete working Java program to demonstrate all

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

 /*  public void check(Node node,String one, String two){
        Node last = null;
        while (node != null) {
            if ((node.data == one) && (node.next.data == two)) //|| ( ((node.data == two)&&(node.next.data== one)) ))
                System.out.println( " are Siblings");
             if ((node.data == one) && (node.prev.data == two))
                System.out.println( " are Siblings");
             if ((node.data == two)&&(node.next.data == one))
                System.out.println ("are Siblings");
             if ((node.data == two)&& (node.prev.data == one))
                System.out.println(" are Siblings");

            last = node;
            node = node.next;
        }

    }

    public static void main(String[] args) {

            List dll = new List();
            dll.append("Plant");
            dll.append("Grasshopper");
            dll.append("Blue Bird");
            dll.append("Snake");
            dll.append("Owl");
            System.out.println("Created DLL is: ");
            dll.printlist(dll.head);
            System.out.println(" If two objects are siblings, you will see that, if not, you will see nothing");
            dll.check(dll.head,"Snake", "Owl");
        }
    }
*/
// This code is contributed by Sumit Ghosh

public String areSiblings(String element1, String element2) {

        System.out.println("Checking if "+element1+" and "+element2+" are siblings");
        Node tmp = head;
        while (tmp != null) {
            if (((tmp == element1)&&(tmp.next == element2))||(((tmp == element2)&&(tmp.next == element1))))
                System.out.println("These elements are siblings");
                else
                    System.out.println("These elements are not siblings");
            };
            tmp = tmp.next;
        }
    }
public class List {
        public static void main (String[] args){
            DoublyLinkedListImpl<String> dll = new DoublyLinkedListImpl<String>();
            dll.addLast("Plant");
            dll.addLast("Grasshopper");
            dll.addLast("Blue Bird");
            dll.addLast("Snake");
            dll.addLast("Owl");
        }
}


