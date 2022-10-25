package by.tms.taskTwo;

import by.tms.taskTwo.classUtil.OrderFillingUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderFillingUtilTest {

    Order order = new Order();

    Item one = new Item("potato", 10);
    Item two = new Item("carrot", 45);
    Item three = new Item("onion", 45);

    @Test
    public void testCheckingForEmptyItems (){
        boolean result = OrderFillingUtil.checkingForEmptyItems(one,two,three);
        assertFalse(result);
    }

    @Test
    public void testCreateNewOrder (){
        OrderFillingUtil.createNewOrder(order, one,two,three);

        assertNotNull(order);
        assertEquals(order.getItemList().size(),3);

    }
}