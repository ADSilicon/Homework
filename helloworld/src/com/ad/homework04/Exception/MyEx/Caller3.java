package com.ad.homework04.Exception.MyEx;

public class Caller3 {

    public void callThrowRTException() {
        System.out.println("Caller3.callThrowRTException开始");

        try {
            Object n=null;
            n.toString();
        } catch (Exception e) {
           throw new MyRTException("run RTE",e);
        }
    }

    public void callThrowException() throws  MyException {
        System.out.println("Caller3.callThrowException开始");

        try {
            Class.forName("com.not.exsit");
        } catch (ClassNotFoundException e) {
           throw  new MyException("",e);
        }
    }
}

