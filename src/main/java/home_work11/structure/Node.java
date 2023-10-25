package home_work11.structure;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    Node(int data) {
        this.value = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    Node() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
