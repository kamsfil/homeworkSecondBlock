package by.tms.taskTwo;

import java.util.Objects;

public class Item {

    private String name;
    private Integer prise;

    public Item(String name, Integer prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrise() {
        return prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(prise, item.prise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }
}