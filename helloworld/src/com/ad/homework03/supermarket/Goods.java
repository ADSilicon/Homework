package com.ad.homework03.supermarket;

import com.ad.homework02.supermarket.LittleMarket;

public class Goods {
    public String name;
    public String id;
    public double sold_price;
    public double purchase_price;
    public int count;
    String madeIn;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSold_price(double sold_price) {
        this.sold_price = sold_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //todo 静态变量 用于打折
    public static double VIP = 8;

    //todo 静态方法 获取VIP
    public static double getVIP() {
        System.out.println("VIP打折：9折");
        System.out.println();
        return VIP;
    }

    //todo 静态方法重载
    public static double getVIP(LittleMarket l) {
        double dis=l.cons*VIP;
        System.out.println("SVIP折上折：8折");
        System.out.println();
        return dis;
    }

    //商品无参构造
    public Goods() {
        this("无名", "000", 0, 1, 1.1);
    }

    public Goods(String name, String id ,int count,double sold_price, double purchase_price) {
        this.name = name;
        this.id = id;
        this.sold_price = sold_price;
        this.purchase_price = purchase_price;
        this.count=count;

    }
    public Goods(String name, String id ,double sold_price, double purchase_price) {
        this.name = name;
        this.id = id;
        this.sold_price = sold_price;
        this.purchase_price = purchase_price;


    }


    //todo 有参方法 计算多件商品总价
    public double total_cost(int buy_num){
        if(count<buy_num){
            System.out.println("库存不足");
            return -1;
        }
        System.out.println("商品单价"+sold_price);
        double cost=buy_num*sold_price;
        count-=buy_num;
        return cost;
    }

    //todo 有参方法重载 计算多件商品总价打折
    public double total_cost(int buy_num,double discount){
        if(count<buy_num){
            System.out.println("库存不足");
            return -1;
        }
        System.out.println("商品单价"+sold_price);
        double cost=buy_num*sold_price;
        count-=buy_num;
        return cost*discount/10;
    }








    //todo 计算单个商品的纯利润
    public double calculateProfit() {
        double profit = sold_price - purchase_price;
        return profit;
    }

    public void buy_print() {
            System.out.println("您选购的商品名字" + this.name);
            System.out.println("单价是" + this.sold_price);
            System.out.println("请问您要购买多少个");
        }

    public void describe(){
        double net_income=this.sold_price-this.purchase_price;
        System.out.println("商品名字叫做"+ this.name + "，id是" + this.id+"，产地是"+this.madeIn+"，库存是"+this.count );
        System.out.println("商品售价是" + this.sold_price+"。商品进价是"+this.purchase_price+"。毛利润为"+net_income);
    }
}
