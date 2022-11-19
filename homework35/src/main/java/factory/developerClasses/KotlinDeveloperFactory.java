package factory.developerClasses;


import factory.interfaces.DeveloperFactory;

public class KotlinDeveloperFactory implements DeveloperFactory {
    @Override
    public KotlinDeveloper createDevelopers() {
        return new KotlinDeveloper();
    }
}
