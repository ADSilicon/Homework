package com.ad.homework02.test;

import com.ad.homework02.person.Customer;
import com.ad.homework02.supermarket.Goods;
import com.ad.homework02.supermarket.LittleMarket;

import java.util.Random;
import java.util.Scanner;

public class AI_test {
    public static void main(String[] args) {
        // 有参构造配置超市信息
        LittleMarket T1 = new LittleMarket("有家小超市","浦东新区世纪大道666号",100);

        //调用类的setGoods()方法，配置商品信息
        Goods[] all = T1.setGoods();
        T1.goods_sold=new int[all.length];

        System.out.println("超市开门了！");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean flag = true;
        //todo 模仿AI对话
        System.out.println("您好以下进入智能AI问答系统,可以输入你的问题。退出请输入负数");
        ai_talk();

        while (flag) {
            //调用方法 打印输出配置商场的信息
            T1.describe();

            //有参构造配置顾客信息
          //  Customer c = new Customer("顾客编号" + r.nextInt(11), r.nextDouble(10001), Math.random() > 0.5);



            while (true) {
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。");
                System.out.println("请输入商品编号:");
                int index = sc.nextInt();
                if (index < 0)
                    break;
                if (index >= all.length) {
                    System.out.println("本店没有这种商品");
                    System.out.println("请输入0到" + (all.length - 1) + "之内的商品编号。");
                    continue;
                }
                all[index].buy_print();
                Goods m = all[index];
                int num_buy = sc.nextInt();

                //todo 调用有参方法获得商品总价
                double total_cost = m.total_cost(num_buy);
                System.out.println("商品总价为" + total_cost);
                System.out.println("----------");

            }}}
            public static void ai_talk(){
                Scanner in = new Scanner(System.in);
                while (true) {
                    String input = in.next();
                    if (input.charAt(0) == '-') {
                        System.out.println("退出AI对话系统，再见");
                        System.out.println();
                        return;
                    }
                    boolean Flag = false;
                    String[] Start = {"有", "能", "在", "还有"};
                    for (int i = 0; i < Start.length; i++) {
                        if (input.startsWith(Start[i]) && (!Flag)) {
                            System.out.println(Start[i] + "!");
                            Flag = true;
                            break;
                        }
                    }
                    String[] Ask = {"吗？", "吗?", "吗"};
                    for (int i = 0; i < Ask.length; i++) {
                        if (input.endsWith(Ask[i]) && (!Flag)) {
                            System.out.println(input.replace(Ask[i], "!"));
                            Flag = true;
                            break;
                        }
                    }
                    if (!Flag) {
                        System.out.println(input + "！");
                        Flag = true;
                    }
                }

            }

        }