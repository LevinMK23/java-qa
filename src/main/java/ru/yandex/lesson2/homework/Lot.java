package ru.yandex.lesson2.homework;

public class Lot {

    private long serialKey;
    private Sku sku;
    private long quantity;

    public Lot(long serialKey, Sku sku, long quantity){
        this.serialKey = serialKey;
        this.sku = sku;
        this.quantity = quantity;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Sku getSku() {
        return sku;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }
}
