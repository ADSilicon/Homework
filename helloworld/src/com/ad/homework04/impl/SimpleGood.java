package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Category;
import com.ad.homework04.interfaces.Good;

public class SimpleGood implements Good {

    private String name;
    private double soldPrice;
    private double purchasePrice;
    private int count;
    private Category category;

    public SimpleGood(String name, double soldPrice, double purchasePrice, int count, Category category) {
        this.name = name;
        this.soldPrice = soldPrice;
        this.purchasePrice = purchasePrice;
        this.count = count;
        this.category = category;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSoldPrice() {
        return soldPrice;
    }

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public int buy(int count) {
        this.count-=count;
        return count;

    }

    @Override
    public void putBack(int count) {
        this.count+=count;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public int getCount() {
        return count;
    }


}
