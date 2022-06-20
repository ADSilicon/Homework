package com.ad.homework03.supermarket;

public class Phone extends Goods{

    //todo 创建Phone 继承 Goods

    protected double screenSize;
    protected double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;
   public int pu;


    //todo 继承父类的describe方法 然后重写
    @Override
    public void describe() {
        System.out.println("此手机商品属性如下");
        super.describe();
        this.describePhone();
    }

    private void describePhone() {
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenSize + "寸\n" +
                "cpu主频" + cpuHZ + " GHz\n" +
                "内存" + memoryG + "Gb\n" +
                "存储空间" + storageG + "Gb\n");

    }

    public Phone() {

    }

    public Phone(String name, String id, int count, double sold_price, double purchase_price, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        //todo 1.调用super来利用父类的构造函数
        super(name, id,count,sold_price, purchase_price);

        //todo 2.调用父类的getter函数
       // this.setName(name);
        //this.setId(id);
       // this.setCount(count);
        //this.setSold_price(sold_price);
        //this.setPurchase_price(purchase_price);


        this.screenSize = screenSize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;
    }
    protected String getNameOfPhone() {
        return this.brand + ":" + this.os + ":" + this.getName();
    }
    public void superDescribe(){
        super.describe();
    }
    public String getName() {
        return this.brand + ":" + this.os + ":" + name;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }
}
