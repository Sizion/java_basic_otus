package home_work_9.job;

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

    @Override
    public int compareTo(Employee o) {
        if (age!=o.getAge()){
            return this.age-o.getAge();
        }
        return this.name.compareTo(o.getName());
    }
}
