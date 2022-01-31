package com.company;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int availableQuantity = 0;
    private int reserved = 0;

    public StockItem (String name, double price) {
        this.name = name;
        this.price = price;
        this.availableQuantity = 0;   // or here, but you wouldn't do both
    }

    public StockItem (String name, double price, int availableQuantity) {
        this.name = name;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock () {
        return availableQuantity - reserved;
    }

    public void setPrice (double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock (int quantity) {
        int newQuantity = this.availableQuantity + quantity;
        if (newQuantity >= 0) {
            this.availableQuantity = newQuantity;
        }
    }

    public int reserveStock (int quantity) {
        if (quantity <= quantityInStock()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock (int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finalizeStock (int quantity) {
        if (quantity <= reserved) {
            availableQuantity -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals (Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode () {
        return this.name.hashCode() + 13;
    }

    @Override
    public int compareTo (StockItem obj) {
//        System.out.println("Entering StockItem.compareTo");
        if (this == obj) {
            return 0;
        }

        if (obj != null) {
            return this.name.compareTo(obj.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString () {
        return this.name + " : price " + this.price + ". Reserved " + this.reserved;
    }
}
