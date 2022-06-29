package com.ad.homework04.Exception.TransmitException;

public class CallerRTex {
    public static void main(String[] args) {
        makecall();
    }

     static void makecall() {
        Caller1 caller1 = new Caller1();
        System.out.println("调用开始");
        caller1.call2RTException();
        System.out.println("调用结束");
    }
}
