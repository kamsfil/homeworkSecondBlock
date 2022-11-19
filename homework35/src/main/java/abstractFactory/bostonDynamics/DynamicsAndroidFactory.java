package abstractFactory.bostonDynamics;

import abstractFactory.interfaces.*;

public class DynamicsAndroidFactory implements AndroidFactory {

    @Override
    public Head getHead() {
        return new DynamicsHead();
    }

    @Override
    public Torso getTorso() {
        return new DynamicsTorso();
    }

    @Override
    public Arms getArms() {
        return new DynamicsArms();
    }

    @Override
    public Legs getLegs() {
        return new DynamicsLegs();
    }
}
