import java.util.LinkedList;

public class CreateLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        size++;
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;

    }

    public void printNode() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){ // Key found condition
                return i;
            }
            temp=temp.next;
            i++;
        }
        // key not found condition 
        return -1;
    }
    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.printNode();
        ll.addFirst(1);
        ll.printNode();
        ll.addFirst(2);
        ll.printNode();
        ll.addFirst(3);
        ll.printNode();

        ll.add(1, 9);
        ll.printNode();
        System.out.println(size);
        // ll.addLast(5);
        // ll.addLast(9);
        // ll.addLast(6);
        // System.out.println(ll);

    }
}