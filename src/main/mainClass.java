package main;

import test.ArrayNode;
import test.ObjectNode;

public class mainClass {
    public static void main(String[] args) {
        System.out.println("Hello World~");

        ObjectNode rootNode = new ObjectNode(1);

        rootNode.leftNode = new ObjectNode(2);
        rootNode.rightNode = new ObjectNode(3);

        rootNode.leftNode.leftNode = new ObjectNode(4);
        rootNode.leftNode.rightNode = new ObjectNode(5);
        rootNode.rightNode.leftNode = new ObjectNode(6);
        //rootNode.rightNode.rightNode = new ObjectNode(7);

        rootNode.leftNode.leftNode.leftNode = new ObjectNode(8);
        rootNode.leftNode.leftNode.rightNode = new ObjectNode(9);
        rootNode.leftNode.rightNode.leftNode = new ObjectNode(10);
        //rootNode.leftNode.rightNode.rightNode = new ObjectNode(11);
        rootNode.rightNode.leftNode.leftNode = new ObjectNode(12);
        rootNode.rightNode.leftNode.rightNode = new ObjectNode(13);
        //rootNode.rightNode.rightNode.leftNode = new ObjectNode(14);
        //rootNode.rightNode.rightNode.rightNode = new ObjectNode(15);

        ObjectNode.preorder(rootNode);
        System.out.println();
        ObjectNode.inorder(rootNode);
        System.out.println();
        ObjectNode.postfix(rootNode);

        /*
        ArrayNode a = new ArrayNode(4);
        a._deleteNode(6, 10, 13, 14);
        a.preorder(0);
        System.out.println();
        a.inorder(0);
        System.out.println();
        a.postfix(0);
         */
    }
}
