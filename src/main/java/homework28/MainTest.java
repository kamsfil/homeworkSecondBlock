/*
Основное задание
1. Создать класс для описания пользователя системы (User).
Переопределить в классе методы toString, hashCode и equals.
Создать несколько экземпляров класса с одним и тем же значением полей и сравнить с помощью метода equals,
убедиться что работает согласование с hashCode.
2. Потренироваться с Integer Pool и String Pool используя сравнение
по ссылке и через equals.

Дополнительное задание
1. Создать программу для реализации поверхностного и глубокого
клонирования объекта класса User. Пусть на вход программе будет
передаваться тип операции клонирования (поверхностное клонирование
или глубокое), а также id пользователя для клонирования.
 */
package homework28;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        User userOne = new User("Dima", "Jakar", 1, new Address("Minsk"));
        User userTwo = new User("Kirill", "Fasbendar", 2,new Address("Kirov"));
        User userThree = new User("Ira", "Panasonic", 3, new Address("Brest"));
        User userFour = new User("Julia", "Friskina", 4,new Address("Talin"));
        User userFive = new User("Julia", "Friskina", 4, new Address("Talin"));

        System.out.printf("If different objects %s \nIf the same objects %s\n", userOne.equals(userTwo), userFour.equals(userFive));
        System.out.printf("The same objects with the same hasCode %s %s\n", userFour.hashCode(), userFive.hashCode());

        System.out.printf("Work String Pool %s  %s\n",(userFour.equals(userFive)), (userFour == userFive));

        Integer one = Integer.valueOf(50);
        Integer two = Integer.valueOf(50);
        Integer Three = new Integer(50);

        System.out.printf("Work Integer Pool  %s  %s  %s  %s\n",(one == two), (one.equals(two)), (one==Three), (one.equals(Three)));

        User userSix = User.cloneUser(3,"shallow");
        User userSeven = User.cloneUser(1,"deep");

        System.out.printf("shallow object cloning - %s \ndeep clone an object - %s\n", userSix, userSeven);
    }
}
