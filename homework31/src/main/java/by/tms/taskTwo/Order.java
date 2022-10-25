package by.tms.taskTwo;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "itemList=" + itemList +
                '}';
    }
}