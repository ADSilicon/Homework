package com.ad.homework03.supermarket;

import com.ad.homework03.supermarket.Phone;

public class testProtected {
    public static void main(String[] args) {
        Phone a =new Phone( "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓");

        //todo protected 同一个包下访问OK
        System.out.println(a.cpuHZ);
    }
}
