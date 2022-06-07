package com.liang.adtest;

import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num={22,33,4,55};
        int[] num1=new int[num.length];
        copy(num,num1);
        print(num1);

    }
    public static void copy(int[] arr1,int[] arr2)
    {
        for (int i = 0; i <arr1.length ; i++) {
            arr2[i]=arr1[i];
        }
    }
    public static void print(int[] arr){
        for (int a = 0; a < arr.length; a++) {
            System.out.print(a==arr.length-1?arr[a]:arr[a]+",");
        }
    }
}

