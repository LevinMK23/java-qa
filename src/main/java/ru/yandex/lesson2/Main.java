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
                .withSerialKey(1)
                .withSku(new Sku(1,1, "sku"))
                .withLot(new Lot(2,new Sku(2,2,"sku2"), 2))
                .withLoc(new Loc(3,"loc",3,3,3,3,3,3,"zone"))
                .withQuantity(4)
                .build();

        System.out.println(serialInventory);

    }
}
