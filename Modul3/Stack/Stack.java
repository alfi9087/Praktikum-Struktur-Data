package Latihan.Stack;

public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        stackArray[++top] = value;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean empty() {
        return (top == -1);
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i] == value) {
                return top - i + 1;
            }
        }
        return -1;
    }
}
