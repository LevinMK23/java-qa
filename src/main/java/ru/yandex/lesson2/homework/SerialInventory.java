package ru.yandex.lesson2.homework;

public class SerialInventory {

    private long serialKey;
    private Sku sku;
    private Lot lot;
    private Loc loc;
    private long quantity;

    public SerialInventory(long serialKey, Sku sku, Lot lot, Loc loc, long quantity){
        this.serialKey = serialKey;
        this.sku = sku;
        this.lot = lot;
        this.loc = loc;
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

    public void setLoc(Loc loc) {
        this.loc = loc;
    }

    public Loc getLoc() {
        return loc;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Lot getLot() {
        return lot;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }
}
