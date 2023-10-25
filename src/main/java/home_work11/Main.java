package home_work11;

import home_work11.structure.Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tree t2 = new Tree();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        t2.rootNode = t2.insertLevelOrder(arr, 0);
        t2.printTree();

    }
}
