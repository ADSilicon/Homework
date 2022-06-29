package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Category;
import com.ad.homework04.interfaces.Customer;
import com.ad.homework04.interfaces.Good;
import com.ad.homework04.interfaces.ShoppingCart;

import static com.ad.homework04.util.ShoppingUtil.getRandomCategory;

public abstract class AbsCustomer implements Customer {

    private Category shouldBuy;
    private String custId;
    private double moneySpent;
    private int guangLeft = 0;
    private int guangCount = 0;

    public static final int DEFAULT_GUANG_COUNT = 5;

    public AbsCustomer(Category shouldBuy, String custId, int guangCount) {
        this.shouldBuy = shouldBuy;
        this.custId = custId;
        this.guangCount = guangCount;
    }

    public int getGuangCount() {
        return guangCount;
    }


    public void setGuangCount(int guangCount) {
        this.guangCount = guangCount;
    }

    public AbsCustomer(String custId, Category shouldBuy) {

        this( shouldBuy, custId,DEFAULT_GUANG_COUNT);
    }


    @Override
    public String getCustomertId() {
        return custId;
    }

    @Override
    public void startShopping() {

        guangLeft=guangCount;
    }

    @Override
    public Category chooseCategory() {
        if(guangLeft+1>=guangCount){
            return shouldBuy;
        }else{
            return  getRandomCategory();
        }

    }

    @Override
    public boolean wanToCheckout() {
        guangLeft--;
        return guangLeft<0;
    }

    @Override
    public double PayFor(ShoppingCart shoppingCart, double totalCost) {
       moneySpent+=totalCost;
        return totalCost;
    }

    @Override
    public double getMoneySpent() {
        return moneySpent;
    }

    public Category getShouldBuy() {
        return shouldBuy;
    }}