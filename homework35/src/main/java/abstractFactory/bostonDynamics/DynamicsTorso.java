package abstractFactory.bostonDynamics;

import abstractFactory.interfaces.Torso;

public class DynamicsTorso implements Torso {
    @Override
    public void control() {
        System.out.println("I turn and bend");
    }
}
