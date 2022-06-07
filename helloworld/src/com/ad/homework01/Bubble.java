package com.ad.homework01;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String str = sc.next();
        sort(str);
    }
    public static void sort(String str){
        char temp;
        char[] c=str.toCharArray();

        for (int m = 0; m < c.length-1; m++) {
            for (int n = 0; n <c.length-m-1 ; n++) {
                if(c[n]<c[n+1])
                {
                    temp=c[n];
                    c[n]=c[n+1];
                    c[n+1]=temp;
                }
            }
        }
        System.out.print("有序字符串：");
        for (int i = 0;i < c.length ; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
        System.out.print("ASCII码：[");
        for (int j = 0; j <c.length ; j++) {
            int num=c[j];
            System.out.print( (j<c.length-1 ? (num + ",") : num+"]"));
        }
    }
}