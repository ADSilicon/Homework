package com.ad.homework02.test;

import com.ad.homework02.supermarket.Goods;
import com.ad.homework02.supermarket.LittleMarket;

public class test05 {
    public static void main(String[] args) {
        Goods m = new Goods();
        LittleMarket l = new LittleMarket();

        //todo 调用静态方法
        double VIP1=Goods.getVIP();

        //todo 调用静态重载方法
        double VIP2=Goods.getVIP(l);
    }
}
