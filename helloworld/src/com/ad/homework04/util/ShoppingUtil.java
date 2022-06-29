package com.ad.homework04.util;

import com.ad.homework04.impl.*;
import com.ad.homework04.interfaces.Category;
import com.ad.homework04.interfaces.Customer;
import com.ad.homework04.interfaces.Good;
import com.ad.homework04.interfaces.SuperMarket;

import java.util.Scanner;

public class ShoppingUtil {

    private static final Scanner in=new Scanner(System.in);

    public static Scanner input(){ return in; }

    public static void output(Object obj){
        System.out.println(String.valueOf(obj));
    }

    public static SuperMarket creatSuperMarket(){
        int GoodPerCategory=10;
        //枚举的.values 是将枚举的值放进数组里面 .ordinal是确定改值在enum的位置
        Good[] all=new Good[Category.values().length*GoodPerCategory];
        for (Category category : Category.values()) {
            for (int i = 0; i < GoodPerCategory; i++) {
                double soldPrice=Math.random()*(category.getHigherPrice()-category.getLowerPrice());
                double purchasePrice=soldPrice*0.7;
                all[category.ordinal()*GoodPerCategory+i]=new SimpleGood(category.name()+i,soldPrice,purchasePrice,200,category);

            }
        }
        SimpleSuperMarket superMarket = new SimpleSuperMarket(all);
        output("请输入超市的名字：");
        String s = input().next();
        if (s.trim().length() > 0) {
            superMarket.setName(s.trim());
        }
        return superMarket;
    }
    public static Customer customer(boolean auto){
        if (auto) {
            String custId = "CUST" + (int) (Math.random() * 10000);
            Category shouldBuy = getRandomCategory();
            if (Math.random() < 0.5) {
                return new randomCustomer(custId, shouldBuy);
            } else {
                ThinkAndBuyCustomer ret = new ThinkAndBuyCustomer(custId, shouldBuy);
                ret.setCard(getRandomVIPCard());
                return ret;
    }
}
        return null;
    }

    public static Category getRandomCategory() {
            return Category.values()[(int) (Math.random() * 1000) % Category.values().length];
        }

    public static VIPCard getRandomVIPCard() {
        return VIPCard.values()[(int) (Math.random() * 1000) % VIPCard.values().length];
    }

    }
