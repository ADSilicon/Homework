package com.ad.homework02.test;

import com.ad.homework02.person.Customer;
import com.ad.homework02.supermarket.Goods;
import com.ad.homework02.supermarket.LittleMarket;

import java.util.Random;
import java.util.Scanner;

public class test04 {

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
                double total_cost=m.total_cost(num_buy);
                System.out.println("商品总价为"+total_cost);
                System.out.println("----------");

                //todo 调用方法重载  获得商品总价打折后
                double discount=m.total_cost(num_buy,9);
                System.out.println("打折总价为"+discount);
                System.out.println("----------");

                //todo 使用静态变量
                double vip=m.total_cost(num_buy,m.VIP);
                System.out.println("打折总价为"+vip);
                System.out.println("----------");
            }
        }}
    }


