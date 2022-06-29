package com.ad.homework04.impl;

import com.ad.homework04.interfaces.*;

import static com.ad.homework04.util.ShoppingUtil.output;

public class SimperShopman implements Shopman {

    private SuperMarket superMarket;
    private static final int MAX_BUY_DEFAULT = 9;

    public SimperShopman(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    @Override
    public void serveCustomer(Customer customer) {
        int maxTypeToBuy=MAX_BUY_DEFAULT;
        if(customer instanceof AbsCustomer){
            maxTypeToBuy=((AbsCustomer) customer).getGuangCount();
        }
        ShoppingCart shoppingCart = new ShoppingCart(maxTypeToBuy);
        customer.startShopping();

        while(!customer.wanToCheckout()&&shoppingCart.canHold()){
            Category category=customer.chooseCategory();
            if(category==null)
                continue;
            Good[] toChoose=superMarket.getRandomGoodOfCategory(category);

            for (Good g : toChoose) {
                if (g == null)
                    continue;
                int buyCount = customer.buyGood(g);
                if (buyCount > 0)
                {
                    shoppingCart.add(g,buyCount);
                    break;
                }
            }
        }

        double originCost = shoppingCart.calculateOriginCost();
        double finalCost = originCost;

        double savedMoney = 0;
        if(customer instanceof HasCard){
            Card card =((HasCard) customer).getCard();
            savedMoney=card.processCardDiscount(originCost,finalCost,customer,shoppingCart);
            finalCost-=savedMoney;

        }
        double moneyEarned = customer.PayFor(shoppingCart,finalCost);

        superMarket.addEarnedMoney(moneyEarned);

        output("顾客" + customer.getCustomertId() + "购物清单如下：");
        output(shoppingCart.toString());
        output("优惠金额为：" + savedMoney);
        output("实付金额为：" + moneyEarned);

    }
}
