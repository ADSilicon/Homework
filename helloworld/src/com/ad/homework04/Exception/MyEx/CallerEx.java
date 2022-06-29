package com.ad.homework04.Exception.MyEx;

import com.ad.homework04.Exception.TransmitException.Caller1;

public class CallerEx {
    public static void main(String[] args) throws ClassNotFoundException {
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");

        caller1.call2Exception();

        System.out.println("调用结束");
    }
}
