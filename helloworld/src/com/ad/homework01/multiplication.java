package com.ad.homework01;

public class multiplication {
    public static void main(String[] args) {
        System.out.println("九九乘法表如下：");
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"X"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
