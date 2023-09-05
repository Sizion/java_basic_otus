package home_work_9;

import home_work_9.job.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static home_work_9.collections.MyList.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);


        System.out.println("Sum elements > 5 = " + getSumArrayMoreFive(arr));

        System.out.println(Collections.min(arr));

        setValueList(11, arr);
        System.out.println("After setValueList = " + arr);
        increaseValueList(2, arr);

        System.out.println("After increaseValueList = " + arr);

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Vany", 45));
        emp.add(new Employee("Tanu", 28));

        System.out.println("Min age = " + Collections.min(emp));

    }
}
