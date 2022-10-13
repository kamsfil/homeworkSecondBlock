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

        User userOne = new User("Dima", "Jakar", 78);
        User userTwo = new User("Kirill", "Fasbendar", 45);
        User userThree = new User("Ira", "Panasonic", 21);

        User userFour = new User("Julia", "Friskina", 1);
        User userFive = new User("Julia", "Friskina", 30);

        System.out.printf("If different objects %s \nIf the same objects %s\n", userOne.equals(userTwo), userFour.equals(userFive));
        System.out.printf("The same objects with the same hasCode %s %s\n", userFour.hashCode(), userFive.hashCode());

        System.out.printf("Work String Pool %s  %s\n",(userFour.equals(userFive)), (userFour == userFive));

        Integer one = Integer.valueOf(50);
        Integer two = Integer.valueOf(50);
        Integer Three = new Integer(50);

        System.out.printf("Work Integer Pool  %s  %s  %s  %s",(one == two), (one.equals(two)), (one==Three), (one.equals(Three)));
    }
}
