package com.ad.homework02.test;

import com.ad.homework02.supermarket.Goods;
import com.ad.homework02.supermarket.LittleMarket;

public class test03 {
    public static void main(String[] args) {
        // 有参构造配置超市信息
        LittleMarket T1 = new LittleMarket("有家小超市","浦东新区世纪大道666号",100);

        //调用类的setGoods()方法，配置商品信息
        Goods[] all = T1.setGoods();
        T1.goods_sold=new int[all.length];

        System.out.println("下面请利润最高的商品自我介绍：");
        //  TODO 返回值可以直接使用，不必赋值给一个变量再使用。
        double profit=T1.get_maxProfit();
        T1.max_good().describe();
        System.out.println("---------------");
        System.out.println();

        //todo 无参构造
        Goods good=new Goods();

        //todo 有参构造配置物品信息
        Goods g = new Goods("书桌","DESK9527",999.9,500,40,"China");
        //调用describe方法
        g.describe();

        //todo 相互调用有重载构造
        Goods s = new Goods("鼠标","DESK9527",1000,true);
        s.describe();

    }
}
