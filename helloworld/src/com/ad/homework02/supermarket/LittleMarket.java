package com.ad.homework02.supermarket;

import java.util.*;

public class LittleMarket {
    public String marketname;
    public String address;
    public double incoming_sum;
    public int park_count;
    public Goods[] goods;
    public int[] goods_sold;
    private Map<Goods,Double> profit;
    public double maxProfit;
    public static double cons = 0.8;




    //无参构造
    public LittleMarket() {

    }
    //构造函数对超市进行初始化赋值
    public  LittleMarket(String marketname,String address,int park_count)
    {
        this.address=address;
        this.park_count=park_count;
        this.marketname=marketname;
    }

    /**
     *  对商品属性赋值
     * @return good数组初始化完成
     */
    public Goods[] setGoods()
    {
        Random r = new Random();
        this.goods=new Goods[200];
        this.goods_sold=new int[this.goods.length];
        Goods[] all = this.goods;
        for (int i = 0; i <all.length ; i++) {
            Goods m = new Goods();
            m.name="商品"+i;
            m.count=200;
            m.purchase_price=r.nextInt(201);
            m.sold_price=m.purchase_price*r.nextDouble(2);
            m.id="ID"+i;
            all[i]=m;
        }
        return all;
    }

    public void describe(){
        System.out.println("本店叫做" + this.marketname);
        System.out.println("本店地址" + this.address);
        System.out.println("共有停车位" + this.park_count + "个");
        System.out.println("今天的营业额为" + this.incoming_sum);
        System.out.println("共有商品" + this.goods.length + "种");
    }
    public void income(){
        for (int i = 0; i <this.goods_sold.length ; i++) {

            Goods m=this.goods[i];
            int num=this.goods_sold[i];
            if(num>0){
                double incoming=m.sold_price*num;
                double net_income=(m.sold_price-m.purchase_price)*num;
                System.out.println(m.name + "售出了" + num + "个。销售额为");
                System.out.println(+ incoming  + "。净利润为" + net_income);

            }
            }
        }


    public double get_maxProfit(){
        // 创建MAP集合记录每个商品的利润
        Map<Goods,Double>maps= new LinkedHashMap<>();
        for (int i = 0; i <this.goods_sold.length ; i++) {
            if(this.goods[i].calculateProfit()>=0)
            maps.put(this.goods[i],this.goods[i].calculateProfit());
            else
                maps.put(this.goods[i],0.00);
        }
        this.profit=maps;
        Collection<Double>c= maps.values();
        Object[] obj =c.toArray();
        Arrays.sort(obj);
        maxProfit= (double) obj[maps.size()-1];
        return (double) obj[maps.size()-1];
    }
    public Goods max_good(){
        for (Goods goods:profit.keySet()
             ) {
            double m=profit.get(goods);
            if(m==maxProfit){
                return goods;
            }
        }
        return null;
    }
    }


