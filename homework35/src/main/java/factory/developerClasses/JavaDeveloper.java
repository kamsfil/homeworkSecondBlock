package factory.developerClasses;

import factory.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("developer writes in language Java");
    }
}
