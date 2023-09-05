package home_work_9.collections;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static List getList(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static int getSumArrayMoreFive(List<Integer> list) {
        int sum = 0;

        for (Integer i : list) {
            if (i > 5) {
                sum += i;
            }
        }

        return sum;
    }

    public static void setValueList(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    public static void increaseValueList(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) +value);
        }
    }

}
