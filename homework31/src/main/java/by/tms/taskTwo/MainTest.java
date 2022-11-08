package by.tms.taskTwo;

import by.tms.taskTwo.classUtil.OrderFillingUtil;

public class MainTest {

    public static void main(String[] args) {

        Item one = new Item("potato", 10);
        Item two = new Item("carrot", 45);
        Item three = new Item("onion", 45);
        Item four = new Item("cabbage", 15);
        Item five = new Item("tomato", 35);
        Item six = new Item("orange", 60);
        Item seven  = new Item("banana", 105);

        Order orderOne = new Order();
        Order orderTwo = new Order();
        Order orderThree = new Order();

        OrderFillingUtil.createNewOrder(orderOne, one, two, three);
        OrderFillingUtil.createNewOrder(orderTwo, four, five, six);
        OrderFillingUtil.createNewOrder(orderThree, two, three, null, five);
    }
}