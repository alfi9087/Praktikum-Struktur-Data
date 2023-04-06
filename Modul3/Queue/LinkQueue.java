package Latihan.Queue;

public class LinkQueue {
    private String[] queue;
    private Link front;
    public FirstLastList theList;
    
    public LinkQueue(){
        theList = new FirstLastList();

    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void enqueue(String j) {
        theList.insertLast(j);
    }
    
    public String dequeue() {
        return theList.deleteFirst();
    }

    public void offer(String data) {
        Link newNode = new Link(data);
        if (theList == null) {
            front = newNode;
            theList = newNode;
        } else {
            theList.first = newNode;
            theList = newNode;
        }
    }

    public String poll() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return theList.removeFirst();
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    public void displayQueue() {
        System.out.print("Queue (Head-->Tail) : ");
        theList.displayLink();
    }
}
