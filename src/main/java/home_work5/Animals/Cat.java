package home_work5.Animals;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.stamina = stamina;
    }

    @Override
    public int run(int distance) {
        int needStaminaRun = 1;
        if (getStamina() >= distance * needStaminaRun) {
            stamina -= distance * needStaminaRun;
            return distance * speedRun;
        } else {
            System.out.println("У " + name + " появилась усталость");
            return -1;
        }
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }


}
