package home_work6.dishes;

public class Plate {
    private final int maxMeal;
    private int currentMeal;

    public int getCurrentMeal() {
        return currentMeal;
    }

    public Plate(int maxMeal) {
        this.maxMeal = maxMeal;
        this.currentMeal = maxMeal;
    }

    public void addMeal(int addMeal) {
        if (currentMeal + addMeal > maxMeal) {
            System.out.println("Нельзя добавить еды больше чем максимальное колличество еды - " + maxMeal);
        } else {
            currentMeal += addMeal;
        }
    }

    public boolean reducMeal(int reducMeal) {

        if (currentMeal - reducMeal >= 0) {
            currentMeal -= reducMeal;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "maxMeal=" + maxMeal +
                ", currentMeal=" + currentMeal +
                '}';
    }
}
