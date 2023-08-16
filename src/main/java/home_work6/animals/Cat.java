package home_work6.animals;

import home_work6.dishes.Plate;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", wantEat=" + satiety +
                '}';
    }

    public void eat(Plate plate) {
        /* Проверка на сытость не нужна, потому что котик всегда хочет жрааааааать*/
        if (plate.getCurrentMeal() >= appetite) {
            plate.reducMeal(appetite);
            satiety = true;
            System.out.println(name + " покушал");
        } else {
            System.out.println("Кожаный мешок, живо положи еду котику " + name);
        }
    }
}
