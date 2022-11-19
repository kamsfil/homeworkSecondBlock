package abstractFactory.bostonDynamics;

import abstractFactory.interfaces.Arms;

public class DynamicsArms implements Arms {
    @Override
    public void take() {
        System.out.println("I grab and lift");
    }
}
