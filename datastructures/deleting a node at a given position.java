class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static Node deleteAtPosition(Node head, int position) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return head;
        }

        // Find the node before the position
        Node curr = head;

        for (int i = 1; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Invalid position
        if (curr == null || curr.next == null) {
            return head;
        }

        // Delete the node
        curr.next = curr.next.next;

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

        // Delete node at position 3
        head = deleteAtPosition(head, 3);

        printList(head);
    }
}
