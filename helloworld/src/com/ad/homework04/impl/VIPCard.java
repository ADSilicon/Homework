package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Card;
import com.ad.homework04.interfaces.Customer;
import com.ad.homework04.interfaces.ShoppingCart;

public enum VIPCard implements Card {
    Level0(1),
    Level1(0.99),
    Level2(0.95),
    Level3(0.9),
    Level4(0.85),
    Level5(0.8);


    private double discount;
    VIPCard(double a ) {
        this.discount=a;
    }

    @Override
    public double processCardDiscount(double totalCost, double totalCostAfterDiscount, Customer customer, ShoppingCart shoppingcart) {
        return totalCostAfterDiscount*(1-discount);
    }
}
