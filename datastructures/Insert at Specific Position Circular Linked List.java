public class Main {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insertPosition(Node head, int data, int pos) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        // Insert at first position
        if (pos == 1) {

            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;

            return newNode;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

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
        head.next.next = new Node(40);
        head.next.next.next = head;

        head = insertPosition(head, 30, 3);

        display(head);
    }
}
