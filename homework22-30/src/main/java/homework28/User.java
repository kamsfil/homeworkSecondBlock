package homework28;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Cloneable {
    private String lastName;
    private String firstName;
    private int id;
    private Address address;

    static List<User> userList = new ArrayList<>();

    public User(String lastName, String firstName, int id, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.address = address;

        userList.add(User.this);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(lastName, user.lastName) && Objects.equals(firstName, user.firstName) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lastName, firstName, id, address);
    }

    @Override
    public String toString() {
        return "User" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", id=" + id +
                ", address=" + address;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    protected User cloneDeep() throws CloneNotSupportedException {
        User user = (User) super.clone();
        Address address = this.getAddress().clone();
        user.setAddress(address);
        return user;
    }

    public static User cloneUser (int id, String whichClone) throws CloneNotSupportedException {
        for (User us : userList) {
            if (us.getId() == id) {
                if (whichClone.equals("shallow")) {
                    return us.clone();
                } else if (whichClone.equals("deep")) {
                    return  us.cloneDeep();
                } else {
                    return null;
                }
            }
        }
        return null;
    }
}