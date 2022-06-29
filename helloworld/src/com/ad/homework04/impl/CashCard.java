package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Card;
import com.ad.homework04.interfaces.Customer;
import com.ad.homework04.interfaces.ShoppingCart;

public class CashCard implements Card {

    private double point;

    public CashCard(double point) {
        this.point = point;
    }

    @Override
    public double processCardDiscount(double totalCost, double totalCostAfterDiscount, Customer customer, ShoppingCart shoppingcart) {
        if(totalCostAfterDiscount<point ){
            point-=totalCostAfterDiscount;
            return totalCostAfterDiscount;
        }else{
            point=0;
            return point;
        }


    }
}
