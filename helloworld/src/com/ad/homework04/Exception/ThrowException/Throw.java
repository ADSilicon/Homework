package com.ad.homework04.Exception.ThrowException;

public class Throw {
    public static void main(String[] args) throws Exception {

        causeException();

        causeRuntimeException();
    }

    public static void causeException() throws Exception {

        throw new Exception("造成异常");

    }

    public static void causeRuntimeException(){
        throw new RuntimeException("运行异常");
    }

}
