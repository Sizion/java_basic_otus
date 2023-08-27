package home_work5;

import home_work5.Animals.Animal;
import home_work5.Animals.Cat;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik", 10, 100);
        Animal cat2 = new Cat("Tom", 15, 50);
        Animal cat3 = new Cat("Vasy", 5, 25);

        System.out.println(cat1.run(50));
        System.out.println(cat1.run(25));


        System.out.println(cat1.info());
    }
}
