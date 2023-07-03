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

        SerialInventory serialInventory = SerialInventoryBuilder.builder()
                .withSerialKey(4278)
                .withSku(new Sku(47, 21, "Description"))
                .withLoc(new Loc(47,"L1", 12, 22, 11, 1, 2, 3, "Zone"))
                .withLot(new Lot(12458, new Sku(1254, 21, "Description2"), 12))
                .withQuantity(12)
                .build();

    }
}
