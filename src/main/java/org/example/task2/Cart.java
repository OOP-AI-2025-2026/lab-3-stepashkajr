package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(int capacity) {
        if (capacity <= 0) {
            this.contents = new Item[10];
        } else {
            this.contents = new Item[capacity];
        }
        this.index = 0;
    }

    public void addItem(Item item) {
        if (item == null || this.isCartFull()) {
            return;
        }

        this.contents[this.index] = item;
        this.index++;
    }

    public void removeItemByIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= this.index) {
            return;
        }
        this.shiftArray(itemIndex);
    }

    public void removeItem(Item item) {
        if (item == null) {
            return;
        }
        int foundItemIndex = this.findItemInArray(item);

        if (foundItemIndex != -1) {
            this.shiftArray(foundItemIndex);
        }
    }

    public int getCount() {
        return this.index;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i] != null) {
                total += this.contents[i].getPrice();
            }
        }
        return total;
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    private int findItemInArray(Item item) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == item.getId()) {
                return i;
            }
        }
        return -1;
    }


    private boolean isCartFull() {
        return this.index == this.contents.length;
    }

    @Override
    public String toString() {
        Item[] currentItems = Arrays.copyOf(this.contents, this.index);
        return "Cart{" +
                "contents=" + Arrays.toString(currentItems) +
                '}';
    }
}
