// Removed unused import

import java.util.LinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Add_Delete {

    Node head; // Added head as a field of the class

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print(Node head){
    // public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        Add_Delete list = new Add_Delete();
        list.addFirst(1);
        list.print(list.head);
    }
    
}
