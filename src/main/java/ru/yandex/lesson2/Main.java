package ru.yandex.lesson2;

import ru.yandex.lesson2.homework.*;

public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.println(p);
        Point p1 = new Point(1, 3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p.getId());
        System.out.println(p1.getId());
        System.out.println(Point.getCounter());
        Point p3 = Point.of(5, 5);

        Point point = PointBuilder.builder()
                .withX(12)
                .withY(7)
                .build();

        Line line = Line.of(1, 3, 1, 5);


        // Homework 2
        Sku sku = new Sku(2L, 3L, "interesting description");
        SerialInventory serialInventory = SerialInventoryBuilder.builder()
                .withSerialKey(1L)
                .withSku(sku)
                .withLot(new Lot(4L, sku, 5L))
                .withLoc(new Loc(6L, "1-01", 1.0, 2.0, 3.0, 1, 2, 3, "MEZ"))
                .withQuantity(7L)
                .build();

    }
}
