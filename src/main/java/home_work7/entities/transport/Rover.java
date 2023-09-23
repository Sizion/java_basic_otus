package home_work7.entities.transport;

import home_work7.actions.Drive;
import home_work7.spaces.Space;

public class Rover implements Drive {

    private int petrol = 100;
    private final int distancePetrol=1;
    @Override
    public boolean drive(Space space, int distance) {
        if (petrol >= distance*distancePetrol) {
            petrol -= distance*distancePetrol;
            System.out.println("Rover has driven distance - " + distance);
            return true;
        } else {
            System.out.println("Rover hasn't petrol");
            return false;
        }
    }
}
