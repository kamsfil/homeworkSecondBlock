package abstractFactory.bostonDynamics;

import abstractFactory.interfaces.Legs;

public class DynamicsLegs implements Legs {
    @Override
    public void walk() {
        System.out.println("I stand and move");
    }
}
