package home_work_19.entities;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box> {

    private List<T> list = new ArrayList<>();

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }

    public void add(T fruit) {
        list.add(fruit);
    }


    public int getWeightBox() {
        int weightBox = 0;
        for (T t : list) {
            weightBox += t.getWeight();
        }
        return weightBox;
    }

    @Override
    public int compareTo(Box box) {
        return Integer.compare(getWeightBox(), box.getWeightBox());
    }

    public void moveToOtherBox(Box<T> box) {
        for (T t : list) {
            box.add(t);
        }
        list.clear();
    }

}
