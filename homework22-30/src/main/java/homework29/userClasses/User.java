package homework29.userClasses;

import homework29.classUtil.WorkingCollectionsUtil;

import java.util.*;

public class User {

    private String name;
    private int age;

    public User() {
        this.name = WorkingCollectionsUtil.randomName();
        this.age = (new Random().nextInt(101 - 16) + 16);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sortReturnTenFirst (List list){              //I WROTE THIS METHOD BECAUSE I DID NOT WANT TO LEAVE THIS CODE IN THE METHOD MAIN
        Collections.sort(list, new Comparator<User>() {      //OR EVERYTHING WOULD HAVE TO LEAVE IT THERE ?
            @Override
            public int compare(User o1, User o2) {
                return (Integer.compare(o2.getAge(), o1.getAge()));
            }
        });

        for (int i = 0; i < 9; i++) {
            System.out.println(list.get(i));
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
