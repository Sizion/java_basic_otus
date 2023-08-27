package home_work6;

import home_work6.animals.Cat;
import home_work6.dishes.Plate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Cat cat1 = new Cat("Barsik", 10);

        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Moty", 20),
                new Cat("Jirok", 25),
                new Cat("Misha", 7),
                new Cat("Miyako", 10)
        };

        Plate plate1 = new Plate(60);

        for (Cat cat : cats) {
            cat.eat(plate1);
            cat.toString();
        }

        System.out.println(plate1.toString());

    }
}
