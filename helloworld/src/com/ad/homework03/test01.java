package com.ad.homework03;

import com.ad.homework03.supermarket.Goods;
import com.ad.homework03.supermarket.Phone;

public class test01 {
    public static void main(String[] args) {
        //todo 引用赋值
        Goods a =new Phone( "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓");

        //todo 调用phone的方法
        a.describe();
        System.out.println();

        //todo 强转
        if(a instanceof Phone)
        {Phone iPhone = (Phone) a;

        iPhone.getBrand();

    }}

}
