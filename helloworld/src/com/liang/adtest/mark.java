package com.liang.adtest;

import java.util.Random;

public class mark {
    public static void main(String[] args) {
        int[] scores = new int[6];
        Random num = new Random();
        int max=0,min=100,total=0;
        int max_index,min_index;
        for (int i = 0; i < 6; i++) {
            scores[i] = num.nextInt(101);
            total+=scores[i];

            if (scores[i]>max) {
                max = scores[i];
                max_index=i;
            }
            if (scores[i]<min){
                min = scores[i];
                min_index=i;
            }
            }
        System.out.print("每个分数:[");
        for (int j = 0; j < 6; j++) {
            System.out.print((j==(scores.length-1)?scores[j]+"]":scores[j]+","));
        }
            double aver=(double) (total-max-min)/4.0;
        System.out.println();
            System.out.println("最高分"+(max));
            System.out.println("最低分"+(min));
            System.out.println("平均分"+(aver));
            System.out.println("总分"+(total));
        }



    }

