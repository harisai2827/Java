class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node deleteLast(Node head) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        // Find second-last node
        Node secondLast = head;

        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        // Delete last node
        secondLast.next = null;

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

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteLast(head);

        printList(head);
    }
}
