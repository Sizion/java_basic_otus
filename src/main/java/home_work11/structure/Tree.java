package home_work11.structure;

import home_work11.SearchTree;

import java.util.List;
import java.util.Stack;

public class Tree<T extends Comparable<T>> implements SearchTree {

    public Node rootNode;
    private T val;

    public Tree() {
        rootNode = null;
    }


    /*public void addValue(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;
            Node parentNode;
            while (true) {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {
                    return;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parentNode.setLeftChild(newNode);
                        return;
                    }
                } else {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parentNode.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }*/

    public static Node convert(int[] keys, int low, int high, Node root)
    {
        // базовый вариант
        if (low > high) {
            return root;
        }

        // найти средний элемент текущего диапазона
        int mid = (low + high) / 2;

        // строим новый узел из среднего элемента и назначаем его корню
        root = new Node(keys[mid]);

        // левое поддерево корня будет состоять из ключей меньше среднего элемента
        root.leftChild = convert(keys, low, mid - 1, root.leftChild);

        // правое поддерево корня будет состоять из ключей больше, чем
        // средний элемент
        root.rightChild = convert(keys, mid + 1, high, root.rightChild);

        return root;
    }

    public Node insertLevelOrder(int[] arr, int i) {
        Node root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new Node(arr[i]);

            // insert left child
            root.setLeftChild(insertLevelOrder(arr, 2 * i + 1));

            // insert right child
            root.setRightChild(insertLevelOrder(arr, 2 * i + 2));
            ;
        }
        return root;
    }

    public void printTree() {
        Stack globalStack = new Stack();
        globalStack.push(rootNode);
        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeftChild());
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null ||
                            temp.getRightChild() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println(separator);
    }

    @Override
    public Node find(int value) {
        Node currentNode = rootNode;

        while (currentNode.getValue() != value) {
            if (value < currentNode.getValue())
                currentNode = currentNode.getLeftChild();
            else
                currentNode = currentNode.getRightChild();
            if (currentNode == null)
                return null;
        }
        return currentNode;
    }


    @Override
    public List getSortedList(List list) {
        return list;
    }

}
