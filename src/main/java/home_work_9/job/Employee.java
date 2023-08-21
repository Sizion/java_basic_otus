package home_work_9.job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    List<String> getListName(ArrayList<Employee> list) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            listName.add(employee.name);
        }
        return listName;
    }

    List<String> getListName(ArrayList<Employee> list, int age) {
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.age >= age) {
                listName.add(employee.name);
            }
        }
        return listName;
    }

    boolean getMiddleAge(ArrayList<Employee> list, int age) {
        int middleAge = 0;
        List<String> listName = new ArrayList<>();
        for (Employee employee : list) {
            middleAge += employee.age;
        }
        return middleAge/list.size()>age;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.age!=o.getAge()){
            return this.age-o.getAge();
        }
        return this.name.compareTo(o.getName());
    }
}
