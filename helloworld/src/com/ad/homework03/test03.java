package com.ad.homework03;

import com.ad.homework03.supermarket.Phone;

public class test03 {
    public static void main(String[] args) {
        Phone a =new Phone( "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓");

        //todo protected 不同包下的本类不能访问
        //System.out.println(a.cpuHZ);

        ColorPhone c = new ColorPhone("手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓");

    }
}
