package test;

public class ObjectNode {
    public ObjectNode leftNode;
    public ObjectNode rightNode;
    public int data;
    public ObjectNode(int data) {
        leftNode = null;
        rightNode = null;
        this.data = data;
    }
    public static void preorder(ObjectNode node) {
        System.out.print("[" + Integer.toHexString(node.data) + "] ");
        if(node.leftNode != null) {
            preorder(node.leftNode);
        }
        if(node.rightNode != null) {
            preorder(node.rightNode);
        }
    }
    public static void inorder(ObjectNode node) {
        if(node.leftNode != null) {
            inorder(node.leftNode);
        }
        System.out.print("[" + Integer.toHexString(node.data) + "] ");
        if(node.rightNode != null) {
            inorder(node.rightNode);
        }
    }
    public static void postfix(ObjectNode node) {
        if(node.leftNode != null) {
            postfix(node.leftNode);
        }
        if(node.rightNode != null) {
            postfix(node.rightNode);
        }
        System.out.print("[" + Integer.toHexString(node.data) + "] ");
    }
}
