package home_work5.Animals;

public class Horse extends Animal {

    public Horse(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

    @Override
    public int run(int distance) {
        int needStaminaRun = 1;
        if (getStamina() >= distance * needStaminaRun) {
            stamina = -distance * needStaminaRun;
            System.out.println(name + " пробежал(а) " + distance + " метров");
            return distance * speedRun;
        } else {
            System.out.println("У" + name + "появилась усталость");
            return -1;
        }
    }

    @Override
    public int swim(int distance) {
        int needStaminaSwim = 4;
        if (getStamina() > distance * needStaminaSwim) {
            stamina -= distance * needStaminaSwim;
            System.out.println(name + " проплыл(а) " + distance + " метров");
            return distance * speedRun;
        } else {
            System.out.println("У" + name + "появилась усталость");
            return -1;
        }
    }
}
