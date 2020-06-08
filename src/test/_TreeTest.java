package test;

import module.BinarySearchTree;

import java.util.HashSet;

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

        int[] arr = {22, 9, 29, 23, 16, 28, 4, 11, 7, 27, 24, 1, 12, 30, 8};
        for(int i : arr) {
            tree.insertRecursive(i);
        }

        int[] del = {22, 9, 29, 23, 16, 28, 4, 11, 7, 27, 24, 1, 12, 30, 8};
        for(int i : del) {
            tree.print();
            System.out.println(tree.delete(i));
            //tree.insertRecursive(i);
        }
        System.out.println(tree.searchRecursive(9));
        System.out.println(tree.search(9));
    }
}
