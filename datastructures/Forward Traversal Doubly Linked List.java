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

    static void forwardTraversal(Node head) {

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ⇄ ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.prev = head;

        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        forwardTraversal(head);
    }
}
