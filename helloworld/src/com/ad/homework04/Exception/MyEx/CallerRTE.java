package com.ad.homework04.Exception.MyEx;

import com.ad.homework04.Exception.TransmitException.Caller1;

public class CallerRTE {
    public static void main(String[] args) {
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");
        caller1.call2RTException();
        System.out.println("调用结束");
    }
}
