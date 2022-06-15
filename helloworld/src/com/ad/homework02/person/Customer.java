package com.ad.homework02.person;

import com.ad.homework02.supermarket.Goods;
import com.ad.homework02.supermarket.LittleMarket;

public class Customer {
    public String name;
    public double money;
    public boolean IsDriving;

    public Customer(String name, double money, boolean isDriving) {
        this.name = name;
        this.money = money;
        IsDriving = isDriving;
    }
    public boolean Driving(LittleMarket T){
        System.out.println();
        if(this.IsDriving)
        {
            if(T.park_count>0)
            {
                System.out.println("欢迎"+this.name+"驾车而来。本店已经为您安排了车位，停车免费哦。车位编号为" + T.park_count);
                T.park_count--;
            }else{
                System.out.println("不好意思，本店车位已满。欢迎您下次光临");
                return true;
            }
        }else{
            System.out.println("欢迎" + this.name + "光临本店");
        }
        return false;
    }
    public boolean Isbuy(int num, Goods m,double total){
        if (num <= 0) {
            System.out.println("不买看看也好，欢迎继续挑选。");
            return true;
        }

        if (num > m.count) {
            System.out.println("本店此商品库存没有这么多，欢迎继续选购。");
            return true;
        }
        if (num * m.sold_price + total > this.money) {
            System.out.println("您带的钱不够，欢迎继续挑选");
            return true;
        }
        return false;
    }
}
