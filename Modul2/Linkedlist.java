package coba;

public class Linkedlist {
    Node head;

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    
    public void remove(String data) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                if (previousNode == null) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void get() {
        Node currentNode = head;
        System.out.print("[");
        while (currentNode != null) {
            System.out.print(currentNode.data + ",");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }

}
