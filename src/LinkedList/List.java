package LinkedList;

import java.util.Iterator;

public class List implements Iterable<Node>{
    private Node head, tail;

    public List() {
        head = null;
        tail = null;
    }

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }

    /*
    creates a new node from the given data

    adds to the end of the list
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if(tail != null){
            tail.setNext(newNode); // make current tail point to the new node
            tail = newNode; // 'tail' title is now on the newNode
        }
        else {
            head = tail = newNode; // crazy compact but both head and tail point to the new node if empty list
        }
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertAtIndex(int index, int data) {
        if(index == 0){ // if wanted at the front, use method
            insertAtFront(data);
        }
        else if(head == null){ // list does not exist
            return;
        }
        else {
            Node current = head;
            int counter = 0;

            while(current != null && counter < index - 1){ // traverse through list; index-1 = position
                current = current.getNext();        // since count must be <, we end on count +1,
                counter++;
            }
            if(current == null){
                return;
            }
            Node newNode = new Node(data);

            if(current == tail){ // if we reach the end of the list, just add 'tail' to the newNode
                tail = newNode;
            }
            newNode.setNext(current.getNext()); // set new node next to reference next
            current.setNext(newNode); // set reference to the newNode, and now newNode points to old 'next'
        }
    }

    /*
    method that removes the node after the param
     */
    public void removeNodeAfter(Node previousNode) {
        if(head == null || previousNode == null || previousNode.getNext() == null){
            return;
        }
        if(previousNode.getNext() == tail){
            tail = previousNode;
        }
        previousNode.setNext(previousNode.getNext().getNext());

//        Node toBeRemoved = previousNode.getNext(); ^^ completes above, but awkwardly
//        if(toBeRemoved.getNext() != null){
//            previousNode.setNext(toBeRemoved.getNext());
//        }
    }

    public int getNodeFromIndexKFromEnd(int k) {
        int counter = 0;
        Node slow = head;
        Node fast = head;

        while(fast != null && counter < k){ // first check; implicit head check;
            fast = fast.getNext(); // set fast to next
            counter++; // raise count
        }
        if(fast == null){ // in case while loop condition fails
            System.out.println("No such node");
            return Integer.MAX_VALUE;
        }
        while(fast != tail){ // second check, allows for second increment for fast,
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow.getElement();
    }

    public void printNodes(){
        Node current = head;
        while(current != null){
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    @Override
    public java.util.Iterator<Node> iterator(){
        return new myIterator();
    }

    public class myIterator implements java.util.Iterator<Node>{
        private Node current;

        public myIterator(){
            current = head;
        }

       @Override
       public boolean hasNext(){
           return current!= null;
       }

       @Override
       public Node next(){
           Node nextNode = current;
           current = current.getNext();
           return nextNode;
       }
   }

}
