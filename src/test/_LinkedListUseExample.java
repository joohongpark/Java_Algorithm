package test;

import module.LinkedList;

public class _LinkedListUseExample {
    static public void exec() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list._print();
        System.out.println("index : 2 / value -> " + list.ValueByIndex(3));
        System.out.println("======= insert data '90' at index 2 ======");
        list.insertNodeByIndex(2, 90);
        list._print();
        System.out.println("======= delete index 3 ======");
        list.deleteNodeByIndex(3);
        list._print();
    }
}