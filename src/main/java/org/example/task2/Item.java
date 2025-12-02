package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    long getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return id + ". " + name + " — " + price + " грн\n";
    }
}
