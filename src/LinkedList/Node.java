package LinkedList;

public class Node {
    private int element;
    private Node next;

    public Node(int value) { // new node with no given next
        this.element = value;
        this.next = null;
    }

    public Node(int value, Node next) { // new node with a given next
        this.element = value;
        this.next = next;
    }

    public int getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) { // sets next to given param
        this.next = next;
    }

    public void setElement(int value) { // sets elem to given param
        this.element = value;
    }

    @Override
    public String toString(){
        return String.valueOf(element);
    }

}
