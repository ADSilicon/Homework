package com.ad.homework01;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class num_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean flag=true;
        while(flag){
        //1.游戏设置
        System.out.println("请输入数字范围最小值：");
        int min=sc.nextInt();
        ifexit(min);
        System.out.println("请输入数字范围最大值：");
        int max=sc.nextInt();
        ifexit(max);
        System.out.println("请输入猜测次数：");
        int chance=sc.nextInt();
        ifexit(chance);
        //2.猜测过程
        int range=max-min+1;
        int num=r.nextInt(range)+min;
        while(chance!=0) {
            System.out.println("请输入你猜测数("+min+","+max+"):");
            System.out.println("剩余次数："+chance+"次"+"  退出游戏输入-1");
            int guess=sc.nextInt();
            ifexit(guess);
            if(guess<min||guess>max)
            {
                System.out.println("你猜测数不在范围内");
                System.out.println("请输入你猜测数("+min+","+max+"):");
            }
            if (guess>num){
                chance--;
                System.out.println("你猜大了，剩余次数："+chance+"次");
                System.out.println("请输入你猜测数("+min+","+max+"):");
            }
            else if(guess<num) {
                chance--;
                System.out.println("你猜小了，剩余次数："+chance+"次");
            }
            else {
                chance--;
                System.out.println("你猜中了，剩余次数："+chance+"次");
                return;
            }
        }
        System.out.println("你没有猜中的数字为"+num);
        System.out.println("-------------------");
        System.out.println();
        }
    }
       public static void ifexit(int f)
        {
            if(f==-1){
                System.out.println("你选择退出游戏");
                System.exit(0);
            }
            else return;

        }

}
