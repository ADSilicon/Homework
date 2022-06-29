package com.ad.homework04.interfaces;

public interface SuperMarket {

    Good[] getAllGood();

    Good[] getRandomGoodOfCategory(Category category);

    void addEarnedMoney(double earnedMoney);

    void dailyReport();
}
