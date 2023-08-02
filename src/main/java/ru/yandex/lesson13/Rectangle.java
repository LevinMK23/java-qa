package ru.yandex.lesson13;

public class Rectangle implements Comparable<Rectangle> {
    int x, y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", x, y);
    }

    @Override
    public int compareTo(Rectangle o) {
        return x * y - o.x * o.y;
    }
}
