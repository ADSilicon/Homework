package com.ad.homework02.test;

import com.ad.homework02.person.Customer;
import com.ad.homework02.supermarket.Goods;
import com.ad.homework02.supermarket.LittleMarket;

import java.util.Random;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

       //todo 有参构造配置超市信息
        LittleMarket T1 = new LittleMarket("有家小超市","浦东新区世纪大道666号",100);

        //todo 调用类的setGoods()方法，配置商品信息
        Goods[] all = T1.setGoods();
        T1.goods_sold=new int[all.length];

        System.out.println("超市开门了！");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean flag = true;

        while (flag){
           //todo 调用方法 打印输出配置商场的信息
            T1.describe();

            //todo 有参构造配置顾客信息
            Customer c = new Customer("顾客编号"+ r.nextInt(11),r.nextInt(10),Math.random() > 0.5);

            //todo 判断是否开车与车位情况
            if(c.Driving(T1))
                continue;

            double total_cost=0;
            while (true){
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。");
                System.out.println("请输入商品编号:");
                int index= sc.nextInt();
                if(index<0)
                    break;
                if (index>=all.length){
                    System.out.println("本店没有这种商品");
                    System.out.println("请输入0到" + (all.length - 1) + "之内的商品编号。");
                    continue;
                }
                all[index].buy_print();
                Goods m=all[index];
                int num_buy=sc.nextInt();
                if(c.Isbuy(num_buy,m,total_cost))
                    continue;

                total_cost+=num_buy*m.sold_price;
                m.count-=num_buy;
                T1.goods_sold[index]+=num_buy;

            }
            c.money-=total_cost;
            if(c.IsDriving){
                T1.park_count++;
            }
            System.out.println("顾客"+c.name+"一共消费"+total_cost);
            T1.incoming_sum+=total_cost;
            System.out.println("继续营业吗？");
            flag=sc.nextBoolean();
        }
        System.out.println("超市关门了");
        System.out.println("今天总的营业额为" + T1.incoming_sum + "。营业情况如下");
        T1.income();
    }
}
