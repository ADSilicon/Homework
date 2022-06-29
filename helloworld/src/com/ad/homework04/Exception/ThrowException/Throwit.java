package com.ad.homework04.Exception.ThrowException;

public class Throwit {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("abc");
        clazz.getField("");
    }
}
