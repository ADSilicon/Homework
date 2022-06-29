package com.ad.homework04.interfaces;

public interface Customer {

    String getCustomertId();


    void startShopping();

    Category chooseCategory();

    int buyGood(Good good);

    boolean wanToCheckout();

    double PayFor(ShoppingCart shoppingCart, double totalCost);

    double getMoneySpent();
}
