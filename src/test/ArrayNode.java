package test;

public class ArrayNode {
    private int[] dataArray;
    public ArrayNode(int depth) {
        dataArray = new int[(int)Math.pow(2, depth) - 1];
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = i + 1;
        }
    }
    public void _deleteNode(int... index) {
        for(int i : index) {
            dataArray[i] = 0;
        }
    }
    public void preorder(int index) {
        System.out.print("[" + Integer.toHexString(dataArray[index]) + "] ");
        if((index + 1) * 2 <= dataArray.length) {
            if (dataArray[(index + 1) * 2 - 1] != 0) {
                preorder((index + 1) * 2 - 1);
            }
        }
        if((index + 1) * 2 <= dataArray.length) {
            if(dataArray[(index + 1) * 2] != 0) {
                preorder((index + 1) * 2);
            }
        }
    }
    public void inorder(int index) {
        if((index + 1) * 2 <= dataArray.length) {
            if (dataArray[(index + 1) * 2 - 1] != 0) {
                inorder((index + 1) * 2 - 1);
            }
        }
        System.out.print("[" + Integer.toHexString(dataArray[index]) + "] ");
        if((index + 1) * 2 <= dataArray.length) {
            if(dataArray[(index + 1) * 2] != 0) {
                inorder((index + 1) * 2);
            }
        }
    }
    public void postfix(int index) {
        if((index + 1) * 2 <= dataArray.length) {
            if (dataArray[(index + 1) * 2 - 1] != 0) {
                postfix((index + 1) * 2 - 1);
            }
        }
        if((index + 1) * 2 <= dataArray.length) {
            if(dataArray[(index + 1) * 2] != 0) {
                postfix((index + 1) * 2);
            }
        }
        System.out.print("[" + Integer.toHexString(dataArray[index]) + "] ");
    }
}
