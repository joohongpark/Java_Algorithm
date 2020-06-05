package test;

import module.BinarySearchTree;

public class _TreeTest {
    public static void biTreeExec() {
        BinarySearchTree tree = new BinarySearchTree();
        /*
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        tree.insert(1);
        tree.insert(9);
         */
        tree.insertRecursive(5);
        tree.insertRecursive(2);
        tree.insertRecursive(7);
        tree.insertRecursive(4);
        tree.insertRecursive(8);
        tree.insertRecursive(1);
        tree.insertRecursive(9);
        tree.print();
        System.out.println(tree.searchRecursive(9));
        System.out.println(tree.search(9));
    }
}
