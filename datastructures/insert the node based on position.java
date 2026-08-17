class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);

        // Insert at first position
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        Node curr = head;

        // Move to the node before the required position
        for (int i = 1; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Invalid position
        if (curr == null) {
            return head;
        }

        // Insert the new node
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = insertAtPosition(head, 25, 3);

        printList(head);
    }
}
