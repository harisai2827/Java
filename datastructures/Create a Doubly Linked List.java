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
    public static void main(String[] args) {

        Node head = new Node(10);

        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
    }
}
