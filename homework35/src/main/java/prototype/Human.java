package prototype;

public class Human implements MyCloneable{
    private String firstname;
    private int age;
    private String lastName;

    public Human(String firstname, int age, String lastName) {
        this.firstname = firstname;
        this.age = age;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Human copy = new Human(firstname, age, lastName);
        return copy;
    }
}
