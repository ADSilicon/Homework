package com.ad.homework04.impl;

import com.ad.homework04.interfaces.Category;
import com.ad.homework04.interfaces.Good;
import com.ad.homework04.interfaces.SuperMarket;

import static com.ad.homework04.util.ShoppingUtil.output;

public class SimpleSuperMarket implements SuperMarket {
    private String name = "无名";

    private Good[] all;

    private int[] allCount;

    private double totalMoneyEarn;

    private int customerCount;

    public SimpleSuperMarket(Good[] all) {
        this.all = all;
        allCount=new int[all.length];
        for (int i = 0; i <all.length ; i++) {
            allCount[i]=all[i].getCount();

        }
    }

    @Override
    public Good[] getAllGood() {
        return all;
    }

    @Override
    public Good[] getRandomGoodOfCategory(Category category) {
       Good[] ret=new Good[5];
       int pos=0;
        for (Good g : all) {
            if(g.getCategory()== category && Math.random() > 0.5 && pos < ret.length - 1)
            {
                ret[pos]=g;
                pos++;
            }
        }
        return ret;
    }

    @Override
    public void addEarnedMoney(double earnedMoney) {
        customerCount++;
        this.totalMoneyEarn += earnedMoney;
    }

    @Override
    public void dailyReport() {
        output("营业额为：" + totalMoneyEarn);
        output("商品售出情况如下：");
        for (int i = 0; i < all.length; i++) {
            if (allCount[i] != all[i].getCount()) {
                System.out.println(all[i].getCategory().name()
                        + "\t" + all[i].getName() + "\t" + (allCount[i] - all[i].getCount()));
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
