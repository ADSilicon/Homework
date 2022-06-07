package com.ad.homework01;

import java.util.Random;

public class Grande {
    public static void main(String[] args) {
    String[] course={"语文","数学","英语","物理","化学","生物"};
        int yuwen=0;
        int shuxue=1;
        int yingyu=2;
        int wuli=3;
        int huaxue=4;
        int shengwu=5;
        int index=0,n=6;
        double max=0;
        double[] scores=new double[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            scores[i]=r.nextInt(0,41)+60;
            if (scores[i]>max){
                max=scores[i];
                index=i;
            }
        }
        for (String s:course) {
            System.out.print(s+"   ");
        }
        System.out.println();
        for (double num:scores) {
            System.out.print(num+"  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("最高成绩的科目为"+course[index]);
        System.out.println("成绩为"+max+"分");
    }
}
