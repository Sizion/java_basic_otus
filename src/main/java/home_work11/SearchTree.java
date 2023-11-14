package home_work11;

import home_work11.structure.Tree;

import java.util.List;

public interface SearchTree<T> {
    /**
     * @param element to find
     * @return element if exists, otherwise - null
     **/
    T find(int value);

    List<T> getSortedList(List <T> list);
}
