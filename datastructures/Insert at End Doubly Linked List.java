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

    static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;

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

        head = insertAtEnd(head, 40);

        printList(head);
    }
}
