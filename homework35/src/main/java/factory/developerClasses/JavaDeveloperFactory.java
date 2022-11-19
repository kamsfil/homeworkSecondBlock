package factory.developerClasses;

import factory.interfaces.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public JavaDeveloper createDevelopers() {
        return new JavaDeveloper();
    }
}
