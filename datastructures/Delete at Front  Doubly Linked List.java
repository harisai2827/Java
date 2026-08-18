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

    static Node deleteAtFront(Node head) {

        if (head == null) {
            return null;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

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

        head = deleteAtFront(head);

        printList(head);
    }
}
