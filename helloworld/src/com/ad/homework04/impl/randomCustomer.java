package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Category;
import com.ad.homework04.interfaces.Good;

public class randomCustomer extends AbsCustomer {

    private static final double MUST_BUY_CHANCE = 0.8;
    private static final double GUANG_BUY_CHANCE = 0.1;


    public randomCustomer(String custId, Category shouldBuy) {
        super(custId, shouldBuy);
    }

    @Override
    public int buyGood(Good good) {
        double chanceToBuy= good.getCategory()==getShouldBuy()?
                MUST_BUY_CHANCE : GUANG_BUY_CHANCE;

        if (chanceToBuy < Math.random()) {
            return 0;
        } else {

            return 1 + (int) (Math.random() * 3);
        }

    }
}
