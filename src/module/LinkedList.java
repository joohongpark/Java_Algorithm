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
        if(head != null) {
            head.pointer = n;
            head = head.pointer;
        } else {
            head = n;
        }
    }
    private node returnNodeByIndex(int index) {
        int i = 0;
        node approach = tail;
        node returnNode = null;
        while(approach != null) {
            i++;
            if(i == index) {
                returnNode = approach.pointer;
                break;
            } else {
                approach = approach.pointer;
            }
        }
        return returnNode;
    }
    public void insertNodeByIndex(int index, int data) {
        node approach = returnNodeByIndex(index - 1);
        node newNode = new node(data);
        newNode.pointer = approach.pointer;
        approach.pointer = newNode;
    }
    public int ValueByIndex(int index) {
        node approach = returnNodeByIndex(index);
        return approach.value;
    }
    public void deleteNodeByIndex(int index) {
        node approach = returnNodeByIndex(index - 1);
        node temp = approach.pointer;
        approach.pointer = temp.pointer;
    }
    public void _print() {
        node approach = tail;
        while(approach != null) {
            System.out.println(approach.value);
            approach = approach.pointer;
        }
    }
}
