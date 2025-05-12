package LinkedList;
import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        List list = new List();
        list.append(1);
        list.append(7);
        list.append(25);
        list.append(50);
        list.append(55);
        list.append(80);
        list.append(100);
        list.append(155);
        list.printNodes();

        Iterator<Node> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        list.insertAtIndex(3, 45);
        list.printNodes();
        System.out.println("Tail is: " + list.getTail().getElement());

        list.removeNodeAfter(list.getHead());
        System.out.println("\nAfter removing the node after the head:\n");
        list.printNodes();

        System.out.println("The element at the node at index 1 from the end:");
        System.out.println(list.getNodeFromIndexKFromEnd(1));

    }
}

