package com.ad.homework02.test;

import com.ad.homework02.supermarket.Goods;

public class test02 {
    public static void main(String[] args) {
        //调用商品有参构造 进行初始化
        Goods good= new Goods("书桌","DESK9527",999.9,500,40,"China");

        //调用describe方法进行输出
        good.describe();
    }

}
