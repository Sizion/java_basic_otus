package home_work7.entities.transport;

import home_work7.actions.Drive;
import home_work7.spaces.Space;

public class Bicycle implements Drive {
    @Override
    public boolean drive(Space space, int distance) {
        if (space == Space.SWAMP) {
            System.out.println("Bicycle can't drive through a swamp");
            return false;
        } else {
            return true;
        }
    }
}
