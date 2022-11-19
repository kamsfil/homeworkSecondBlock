package abstractFactory;

import abstractFactory.bostonDynamics.DynamicsAndroidFactory;
import abstractFactory.interfaces.*;

public class Main {

    public static void main(String[] args) {
        AndroidFactory androidOne = new DynamicsAndroidFactory();
        Arms arms = androidOne.getArms();
        Head head = androidOne.getHead();
        Legs legs = androidOne.getLegs();
        Torso torso = androidOne.getTorso();

        System.out.println("First launch of Android \n");

        arms.take();
        head.think();
        legs.walk();
        torso.control();
    }
}