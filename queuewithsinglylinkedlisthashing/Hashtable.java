package queuewithsinglylinkedlisthashing;

public class Hashtable {
    class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
      this.next = null;
    }
}
    Node[] table;
        int size;

    public Hashtable(int size) {
        this.size = size;
        table = new Node[size];
    }

    int hash(int key) {
        return key % size;
    }

    public void put(int key) {
        int index = hash(key);
        Node newNode = new Node(key);

        newNode.next = table[index];
        table[index] = newNode;
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            Node temp = table[i];
            while (temp != null) {
                System.out.print(temp.key + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public void remove(int key) {
        int index = hash(key);
        Node temp = table[index];
        Node prev = null;

        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) {
                    table[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }
            System.out.println("Key " + key + " removed.");
            return;
              }
              prev = temp;
          temp = temp.next;
        }

        System.out.println("Key not found.");
    }

    public static void main(String[] args) {
        Hashtable ht = new Hashtable(5);

        ht.put(10);
        ht.put(20);
        ht.put(35);
        ht.put(47);
        ht.printTable();
        ht.remove(35);
        ht.remove(10);
        ht.remove(99);

        ht.printTable();
    }
}
