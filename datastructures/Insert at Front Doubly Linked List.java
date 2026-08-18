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

    static Node insertAtFront(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ⇄ ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(20);
        head.next = new Node(30);
        head.next.prev = head;

        head = insertAtFront(head, 10);

        printList(head);
    }
}
