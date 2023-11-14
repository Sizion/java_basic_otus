package home_work11;

import home_work11.structure.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static home_work11.structure.Tree.convert;

public class Main {
    public static void main(String[] args) {

        Tree tree2 = new Tree();
        // ключи ввода
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        Arrays.sort(keys);

        // построить сбалансированное бинарное дерево поиска

        tree2.rootNode = convert(keys, 0, keys.length - 1, null);

        tree2.printTree();

    }
}
