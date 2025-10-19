package Assignment4;

public class Doublylinkedlist {
    Node head;
    Node tail;
    int size;

    public Doublylinkedlist(){
        this.head = null;
        this.tail = null;
        size = 0;
    } 

    public void addfirst(int data){
        Node newnode = new Node(data, head, null);

        if(head != null){
            head.prev = newnode;
        } else {
            tail = newnode;
        }
        head = newnode;
        size++;
    }

    public void addlast(int data){
        if(head == null){
            addfirst(data);
        } else {
            Node newnode = new Node(data, null, tail);
            tail.next = newnode;
            tail = newnode;
            size++;
        }
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void displayForward(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Forward: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev; 
        }
        System.out.println();
    }

    private class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        Doublylinkedlist marks = new Doublylinkedlist();
        marks.addfirst(100);
        marks.addfirst(200);
        marks.addfirst(10);
        marks.addlast(30);
        marks.displayForward();
        marks.deleteLast();
        marks.displayForward();
        marks.displayBackward();
    }
}
