package com.ad.homework03;

import com.ad.homework03.supermarket.Goods;
import com.ad.homework03.supermarket.Phone;

public class test02 {
    public static void main(String[] args) {
        //todo super 子类
        Phone a =new Phone( "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓");

        //todo 通过子类写super的方法调用父类函数
        a.superDescribe();
        System.out.println("-----------------");
        System.out.println();
        //todo 覆盖 describe方法
        Goods g = new Goods("书桌","DESK9527",50,999.9,500);
        System.out.println("书桌信息");
        g.describe();
        System.out.println("-----------------");
        System.out.println();
        System.out.println("手机信息");
        a.describe();


    }



}
