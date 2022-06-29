package com.ad.homework04.Exception.TransmitException;

public class Caller3 {
    public void callThrowRTException(){

        //todo RuntimeException 可以不被throw
        System.out.println("Caller3.callThrowRTException开始");
        Object n=null;
        n.toString();
        System.out.println("Caller3.callThrowRTException结束");
    }
    public void callThrowException() throws ClassNotFoundException {
        System.out.println("Caller3.callThrowException开始");
        Class.forName("com.neverland.Cat");
        System.out.println("Caller3.callThrowException结束");
    }
}
