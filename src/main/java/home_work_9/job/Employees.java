package home_work_9.job;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    List<String> getListName(ArrayList<Employee> list) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            listName.add(employee.name);
        }
        return listName;
    }

    boolean getMiddleAge(ArrayList<Employee> list, int age) {
        int middleAge = 0;
        for (Employee employee : list) {
            middleAge += employee.age;
        }
        return middleAge/list.size()>age;
    }

    List<String> getListNameByAge(ArrayList<Employee> list, int age) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.age >= age) {
                listName.add(employee.name);
            }
        }
        return listName;
    }
}
