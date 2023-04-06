package Latihan.Queue;

public class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(String dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public String deleteFirst() {
        String temp = (String) first.dDate;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public String removeFirst() {
        if (first == null) {
            throw new RuntimeException("Linked list is empty");
        }
        String removed = first.dDate;
        first = first.next;
        return removed;
    }

    public void displayLink() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
