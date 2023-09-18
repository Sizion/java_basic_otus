package home_work7.entities.transport;

import home_work7.actions.Drive;
import home_work7.spaces.Space;

public class Car implements Drive {

    private int petrol=100;
    private final int distancePetrol=1;
    @Override
    public boolean drive(Space space, int distance) {
        if (space == Space.DEFENSE_FOREST || space == Space.SWAMP) {
            System.out.println("Car can't drive through a dense forest ");
            return false;
        }
        if (petrol >= distance*distancePetrol) {
            petrol -= distance*distancePetrol;
            System.out.println("Car has driven distance - " + distance);
            return true;
        } else {
            System.out.println("Car hasn't petrol");
            return false;
        }
    }
}
