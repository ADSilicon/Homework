package com.ad.homework02.test;

import com.ad.homework02.guess.guess;

import java.util.Scanner;

public class Num_guess_AI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

            //2.调用方法产生数字
            guess g=new guess(max,min,chance);

            //3.进入AI对话
            g.AI_guess();


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
