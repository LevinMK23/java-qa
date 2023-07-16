package ru.yandex.lesson2.homework;

//SerialInventory: serialKey(long), sku(Sku), lot(Lot), loc(Loc), quantity(long)
//Lot: serialKey(long), sku(Sku), quantity(long)
//Loc: serialKey(long), name(String), length(double), width(double), height(double), x(int), y(int), z(int), zone(String)
//Sku: serialKey(long), storerKey(long), description(String)
public class Sku {
    private long serialKey;
    private long storerKey;
    private String description;

    public Sku(long serialKey, long storerKey, String description) {
        this.serialKey = serialKey;
        this.storerKey = storerKey;
        this.description = description;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public void setStorerKey(long storerKey) {
        this.storerKey = storerKey;
    }

    public long getStorerKey() {
        return storerKey;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
