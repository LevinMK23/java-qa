package ru.yandex.lesson2.homework;

public class Sku {

    private long serialKey;
    private long storerKey;
    private String description;

    public Sku(long serialKey, long storerKey, String description){
        this.serialKey = serialKey;
        this.storerKey = storerKey;
        this.description = description;
    }

    public void setSerialKey(long serialKey){
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
