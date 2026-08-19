public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deletePosition(Node head, int pos) {

        if (head == null)
            return null;

        // Delete first node
        if (pos == 1) {

            if (head.next == head)
                return null;

            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            head = head.next;
            temp.next = head;

            return head;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;

            if (temp.next == head)
                return head;
        }

        temp.next = temp.next.next;

        return head;
    }

    static void display(Node head) {

        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        head = deletePosition(head, 3);

        display(head);
    }
}
