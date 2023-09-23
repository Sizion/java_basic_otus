package home_work7;

import home_work7.entities.Human;
import home_work7.entities.transport.Car;
import home_work7.entities.transport.Horse;
import home_work7.spaces.Space;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Vany", new Car());

        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 10));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 40));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 90));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 10));

        human1.setCurrentTransport(new Horse());
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 10));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 20));
        System.out.println(human1.getCurrentTransport().drive(Space.PLAIN, 200));

        human1.setCurrentTransport(null);

        human1.drive( Space.PLAIN, 10);

    }
}
