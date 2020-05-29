package module;

public class LinkedList {
    // 노드 클래스 선언 (Member Inner Class)
    node head = null;
    node tail = null;
    class node {
        int value;
        node pointer;
        node(int value) {
            this.value = value;
            this.pointer = null;
        }
    }
    public void insert(int data) {
        node n = new node(data);
        if(tail == null) {
            tail = n;
        }
        n.pointer = head;
        head = n;
    }
    public void _print() {
        node approach = tail;
        while(approach != null) {
            System.out.println(approach.value);
            approach = approach.pointer;
        }
    }
}
