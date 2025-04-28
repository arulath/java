class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void findMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("The middle element is: " + slow.data);
    }
}
public class middleelementls {  
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Find the middle
        list.findMiddle();
    }
}
