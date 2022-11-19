package abstractFactory.bostonDynamics;

import abstractFactory.interfaces.Head;

public class DynamicsHead implements Head {
    @Override
    public void think() {
        System.out.println("I watch and analyze world");
    }
}
