class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Main {

    static Node insertAtPosition(Node head, int data, int position) {

        Node newNode = new Node(data);

        // Position 1
        if (position == 1) {

            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            return newNode;
        }

        Node curr = head;

        // Go to node before the position
        for (int i = 1; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        // Insert 25 at position 3
        head = insertAtPosition(head, 25, 3);

        printList(head);
    }
}
