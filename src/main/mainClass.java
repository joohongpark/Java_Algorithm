package main;

import module.LinkedList;

public class mainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list._print();
    }
}
