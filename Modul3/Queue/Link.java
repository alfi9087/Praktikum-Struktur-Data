package Latihan.Queue;

public class Link {
    public String dDate;
    public Link next;
    public Link first;

    public Link(String d) {
        dDate = d;
    }

    public void displayLink() {
        System.out.print(dDate + " ");
    }

    public String deleteFirst() {
        return null;
    }
}
