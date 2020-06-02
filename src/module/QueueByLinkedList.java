package module;

public class QueueByLinkedList {
    node head = null;
    node tail = null;
    private int usedSize = 0;
    class node {
        int value;
        node pointer;
        node(int value) {
            this.value = value;
            this.pointer = null;
        }
    }
    public boolean isEmpty() {
        return (tail == null);
    }
    public void enqueue(int data) {
        node n = new node(data);
        if(tail == null) {
            tail = n;
        }
        if(head != null) {
            head.pointer = n;
            head = head.pointer;
        } else {
            head = n;
        }
        usedSize++;
    }
    public int dequeue() {
        int returnValue = 0;
        if(!isEmpty()) {
            returnValue = tail.value;
            tail = tail.pointer;
            usedSize--;
        }
        return returnValue;
    }
    public int getFrontValue() {
        int returnValue = 0;
        if(!isEmpty()) {
            returnValue = tail.value;
        }
        return returnValue;
    }
    public int usedSize() {
        return usedSize;
    }
}
