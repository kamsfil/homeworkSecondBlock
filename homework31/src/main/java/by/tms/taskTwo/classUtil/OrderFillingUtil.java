package by.tms.taskTwo.classUtil;

import by.tms.taskTwo.Item;
import by.tms.taskTwo.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class OrderFillingUtil {

    private static final Logger OrderFilling = LogManager.getLogger(Order.class);

    public static Order createNewOrder(Order order, Item... items) {
        OrderFilling.info("начало создания нового заказа");

        if (items == null) {
            OrderFilling.error("ошибка во время чтения товаров. Товар не может содержать значение null ");
            return null;
        }

        try {
            if (checkingForEmptyItems(items)) {
                return null;
            }
            order.setItemList(Arrays.asList(items));

        } catch (Exception e) {
            e.printStackTrace();
            OrderFilling.error("ошибка во время создания заказа " + e);
            return null;
        }

        OrderFilling.info("в заказ успешно добавлены товары " + Arrays.toString(items));
        return order;
    }

    public static boolean checkingForEmptyItems(Item... items) {
        int num = items.length;

        if (num < 1) {
            OrderFilling.error("добавилось ноль товаров !!");
            return true;
        }
        if (num == 1) {
            return false;
        }
        for (Item it : items) {
            if (it == null) {
                OrderFilling.error("ошибка во время заполнения заказа, товар не может содержать значение null ");
                return true;
            }
        }
        return false;
    }
}