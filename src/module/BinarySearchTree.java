package module;

import test.ObjectNode;

public class BinarySearchTree {
    public ObjectNode rootNode = null;

    public void insert(int data) {
        // approach에 직접 생성자 이용하여 대입하면 실제로 노드에 반영이 안되기 때문0에 다음과 같이 구현함.
        ObjectNode approach = rootNode; // 초기에 루트 노드에 접근함
        while (true) {
            if (approach != null) {
                if(approach.data > data) {
                    if(approach.leftNode == null) {
                        approach.leftNode = new ObjectNode(data);
                        break;
                    } else {
                        approach = approach.leftNode;
                    }
                } else {
                    if(approach.rightNode == null) {
                        approach.rightNode = new ObjectNode(data);
                        break;
                    } else {
                        approach = approach.rightNode;
                    }
                }
            } else { // 초기 상태일때만 실행됨
                rootNode = new ObjectNode(data);
                break;
            }
        }
    }

    public void insertRecursive(int data) {
        if(rootNode == null) {
            rootNode = new ObjectNode(data);
        } else {
            insert(rootNode, data);
        }
    }

    private void insert(ObjectNode node, int data) {
        if(node.data > data) {
            if(node.leftNode == null) {
                node.leftNode = new ObjectNode(data);
            } else {
                insert(node.leftNode, data);
            }
        } else {
            if(node.rightNode == null) {
                node.rightNode = new ObjectNode(data);
            } else {
                insert(node.rightNode, data);
            }
        }
    }

    public boolean search(int data) {
        ObjectNode approach = rootNode; // 초기에 루트 노드에 접근함
        boolean returnValue = false;
        while (true) {
            if (approach == null) {
                break;
            } else if(approach.data == data) {
                returnValue = true;
                break;
            } else if(approach.data > data) {
                approach = approach.leftNode;
            } else {
                approach = approach.rightNode;
            }
        }
        return returnValue;
    }

    public boolean searchRecursive(int data) {
        return search(rootNode, data);
    }

    private boolean search(ObjectNode node, int data) {
        boolean returnValue;
        if(node == null) {
            returnValue = false;
        } else if(node.data == data) {
            returnValue = true;
        } else if(node.data > data) {
            returnValue = search(node.leftNode, data);
        } else {
            returnValue = search(node.rightNode, data);
        }
        return returnValue;
    }
    public void print() {
        ObjectNode.inorder(rootNode);
        System.out.println();
    }
}
