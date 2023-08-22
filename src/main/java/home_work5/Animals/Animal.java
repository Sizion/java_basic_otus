package home_work5.Animals;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int stamina;

    public int getStamina() {
        return stamina;
    }

    public String info() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speedRun='" + speedRun + '\'' +
                ", speedSwim='" + speedSwim + '\'' +
                ", stamina=" + stamina +
                '}';
    }

    public abstract int run(int distance);

    public abstract int swim(int distance);

}
