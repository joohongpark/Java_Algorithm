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

    private boolean deleteLeafNode(ObjectNode parentNode, ObjectNode subNode) {
        boolean returnValue = false;
        if(parentNode == null) {
            parentNode = rootNode;
        }
        // parentNode 에 접근해서 subNode 를 삭제함.
        if(parentNode.leftNode == subNode) {
            parentNode.leftNode = null;
            returnValue = true;
        } else if(parentNode.rightNode == subNode) {
            parentNode.rightNode = null;
            returnValue = true;
        } else if(parentNode == rootNode) {
            rootNode = null;
            returnValue = true;
        }
        return returnValue;
    }

    private boolean deleteEitherNode(ObjectNode parentNode, ObjectNode subNode) {
        boolean returnValue = false;
        if(parentNode == null) {
            parentNode = rootNode;
        }
        if(parentNode.leftNode == subNode) {
            if(subNode.leftNode != null) {
                parentNode.leftNode = subNode.leftNode;
            } else {
                parentNode.leftNode = subNode.rightNode;
            }
            returnValue = true;
        } else if(parentNode.rightNode == subNode) {
            if(subNode.leftNode != null) {
                parentNode.rightNode = subNode.leftNode;
            } else {
                parentNode.rightNode = subNode.rightNode;
            }
            returnValue = true;
        } else if(parentNode == rootNode) {
            if(subNode.leftNode != null) {
                rootNode = subNode.leftNode;
            } else {
                rootNode = subNode.rightNode;
            }
            returnValue = true;
        }
        return returnValue;
    }

    public boolean delete(int data) {
        // 검색 로직 그대로 카피
        ObjectNode approach = rootNode; // 초기에 루트 노드에 접근함
        ObjectNode parent = null;
        boolean returnValue = false;
        while (true) {
            if (approach == null) {
                break;
            } else if(approach.data == data) {
                returnValue = true;
                break;
            } else if(approach.data > data) {
                parent = approach;
                approach = approach.leftNode;
            } else {
                parent = approach;
                approach = approach.rightNode;
            }
        }
        if(returnValue) {
            if(approach.leftNode == null && approach.rightNode == null) { // leaf node
                returnValue = deleteLeafNode(parent, approach);
            } else if(approach.leftNode == null ^ approach.rightNode == null) { // 둘중 하나만 자식이 있을때
                returnValue = deleteEitherNode(parent, approach);
            } else { // 둘다 자식이 있을때
                ObjectNode replaceNode = approach.rightNode; // 해당노드보다 큰 노드를 찾아야 하므로 right node에 접근
                ObjectNode parentNodeOfReplace = approach;
                while(replaceNode.leftNode != null) {
                    parentNodeOfReplace = replaceNode;
                    replaceNode = replaceNode.leftNode;
                }
                // 1. 값 복사
                approach.data = replaceNode.data;
                // 2. 대체 노드 제거
                if(replaceNode.rightNode == null) { // leaf node
                    returnValue = deleteLeafNode(parentNodeOfReplace, replaceNode);
                } else { // rightNode가 null이 아닐때
                    returnValue = deleteEitherNode(parentNodeOfReplace, replaceNode);
                }
            }
        }
        return returnValue;
    }
    public void print() {
        ObjectNode.inorder(rootNode);
        System.out.println();
    }
}
