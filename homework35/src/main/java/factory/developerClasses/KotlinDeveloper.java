package factory.developerClasses;

import factory.interfaces.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("developer writes in language Kotlin");
    }
}
