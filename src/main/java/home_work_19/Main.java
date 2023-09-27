package home_work_19;

import home_work_19.entities.Apple;
import home_work_19.entities.Box;
import home_work_19.entities.Fruit;
import home_work_19.entities.Orange;

public class Main {
    public static void main(String[] args) {

        Box<Fruit> boxFruit = new Box<>();
        boxFruit.add(new Orange(2));
        boxFruit.add(new Orange(2));
        boxFruit.add(new Apple(1));
        boxFruit.add(new Apple(1));
        System.out.println(boxFruit);
        System.out.println("weight = " + boxFruit.getCurrentWeghtBox());

        Box<Orange> boxOrange = new Box<>();

        boxOrange.add(new Orange(2));
        boxOrange.add(new Orange(2));
        boxOrange.add(new Orange(2));


        System.out.println(boxOrange);
        System.out.println("weight = " + boxOrange.getCurrentWeghtBox());

        Box<Apple> boxApple = new Box<>();
        boxApple.add(new Apple(1));
        boxApple.add(new Apple(1));
        boxApple.add(new Apple(1));
        boxApple.add(new Apple(1));

        System.out.println(boxApple);
        System.out.println("weight = " + boxApple.getCurrentWeghtBox());

        System.out.println("Compare   " + boxApple.compareTo(boxOrange));

        Box<Orange> newBoxOrange = new Box<>();
        boxOrange.moveToOtherBox(newBoxOrange);

        Box<Apple> newBoxApple = new Box<>();
        boxApple.moveToOtherBox(newBoxApple);

        Box<Fruit> newBoxFruit = new Box<>();
        newBoxFruit.moveToOtherBox(newBoxFruit);


        System.out.println(boxOrange);
        System.out.println(newBoxOrange);

        Box<Orange> boxOrange2 = new Box<>();
        boxOrange2.add(new Orange(2));
        boxOrange2.add(new Orange(2));
        System.out.println("boxOrange2 weight = " + boxOrange2.getCurrentWeghtBox());

        Box<Apple> boxApple2 = new Box<>();
        boxApple2.add(new Apple(1));
        boxApple2.add(new Apple(1));
        boxApple2.add(new Apple(1));
        System.out.println("boxApple2 weight = " + boxApple2.getCurrentWeghtBox());

        System.out.println(boxOrange2.compareBox(boxApple2));
    }
}
