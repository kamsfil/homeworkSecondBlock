package factory;

import factory.developerClasses.JavaDeveloperFactory;
import factory.developerClasses.KotlinDeveloperFactory;
import factory.interfaces.Developer;
import factory.interfaces.DeveloperFactory;

public class Main {
    public static void main(String[] args) {

        DeveloperFactory developerOne = createDevelopersBySpecialty("Java");
        Developer developerTwo = developerOne.createDevelopers();
        developerTwo.writeCode();

    }

    static DeveloperFactory createDevelopersBySpecialty (String language){
        if(language.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        } else if (language.equalsIgnoreCase("Kotlin")){
            return new KotlinDeveloperFactory();
        } else {
            throw new RuntimeException(language + " does not exist in this program");
        }
    }
}