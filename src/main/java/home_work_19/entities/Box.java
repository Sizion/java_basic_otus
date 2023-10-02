package home_work_19.entities;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box> {

    private List<T> list = new ArrayList<>();

    private int currentWeghtBox;

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }

    public void add(T fruit) {
        list.add(fruit);
        currentWeghtBox +=fruit.getWeight();
    }

    public int getCurrentWeghtBox() {
        return currentWeghtBox;
    }

    public void setCurrentWeghtBox(int currentWeghtBox) {
        this.currentWeghtBox = currentWeghtBox;
    }

    @Override
    public int compareTo(Box box) {
        return Integer.compare(currentWeghtBox, box.currentWeghtBox);
    }

    public void moveToOtherBox(Box<T> box) {
        for (T t : list) {
            box.add(t);
        }
        list.clear();
        currentWeghtBox =0;
    }

    public boolean compareBox(Box box){
        return this.currentWeghtBox >box.currentWeghtBox;
    }

}
