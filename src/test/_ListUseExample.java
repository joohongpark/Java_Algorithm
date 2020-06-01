package test;

import module.List;

public class _ListUseExample {
    static public void exec() {
        List list = new List();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list._printAll();
        System.out.println("============================");
        System.out.println("where is '30'? -> index : " + list.search(30));
        System.out.println("======= delete index 3 ======");
        list.delete(3);
        list._printAll();
        System.out.println("======= insert data '90' at index 2 ======");
        list.insertAt(2, 90);
        list._printAll();
        System.out.println("list size : " + list.listSize());
    }
}
