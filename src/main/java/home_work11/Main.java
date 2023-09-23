package home_work11;

import home_work11.structure.Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        List<Integer> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = list.size()/2; i < list.size(); i++) {
            tree.addValue(list.get(i));
            tree.addValue(list.get(list.size()-i));
        }

        tree.printTree();

    }

}
