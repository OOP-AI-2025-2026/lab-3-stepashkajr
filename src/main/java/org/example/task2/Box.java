package org.example.task2;

class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double l) {
        if (l > 0) length = l;
        else length = 1;
    }

    private void setWidth(double w) {
        if (w > 0) width = w;
        else width = 1;
    }

    private void setHeight(double h) {
        if (h > 0) height = h;
        else height = 1;
    }

    double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    double lateralArea() {
        return 2 * height * (length + width);
    }

    double volume() {
        return length * width * height;
    }
    public static void main(String[] args){
        System.out.println("\nкоробка");
        Box box = new Box(2.5, 3.0, 4.0);
        System.out.println("Площа поверхні: " + box.surfaceArea());
        System.out.println("Площа бічної поверхні: " + box.lateralArea());
        System.out.println("Обʼєм: " + box.volume());
    }

}
