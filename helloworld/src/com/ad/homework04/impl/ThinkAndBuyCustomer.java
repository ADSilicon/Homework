package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Card;
import com.ad.homework04.interfaces.Category;
import com.ad.homework04.interfaces.Good;
import com.ad.homework04.interfaces.HasCard;

public class ThinkAndBuyCustomer extends AbsCustomer implements HasCard {

    private Card card = VIPCard.Level0;

    public ThinkAndBuyCustomer(String custId,Category shouldBuy) {
        super(shouldBuy, custId, DEFAULT_GUANG_COUNT);
        this.card = card;
    }
    @Override
    public int buyGood(Good good) {
        Category category=good.getCategory();
        if(category==getShouldBuy())
        return 1;

        double soldPrice=good.getSoldPrice();
        double avgPrice=(category.getHigherPrice()+category.getLowerPrice())/2;
        if(soldPrice<avgPrice)
            return 1;
        else return 0;

}
    public void setCard(Card card) {
        this.card = card;
    }
    @Override
    public Card getCard() {
        return card;
    }

}
