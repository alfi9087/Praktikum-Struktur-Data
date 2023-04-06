package Latihan.Queue;

public class Main {
    public void queueExample() {
        LinkQueue queue = new LinkQueue();
        queue.enqueue("Java");
        queue.enqueue("DitNet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove: " + queue.dequeue());
        System.out.println("element: " + queue.element());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
    }
    public static void main(String[] args) {
        new Main().queueExample();
    }
}
