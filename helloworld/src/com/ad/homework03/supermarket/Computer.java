package com.ad.homework03.supermarket;

import java.util.Random;

public class Computer implements Hardware,Software{


    public String CPU;
    public String Screen;
    public String SYstem;
    public int  MemoryG;
    public Computer[] computer;




    @Override
    public void Fix(boolean i) {
        System.out.println(i==true?"安装了底层系统":"没有安装底层系统");
    }

    @Override
    public void PhotoShop(boolean i) {
        System.out.println(i==true?"安装了PhotoShop":"没有安装PhotoShop");
    }

    @Override
    public void Microsoft(boolean i) {
        System.out.println(i==true?"安装了Microsoft":"没有安装Microsoft");
    }

    @Override
    public void PUBG(boolean i) {
        System.out.println(i==true?"安装了PUBG":"没有安装PUBG");
    }

    public Computer(String CPU, String screen, String system, int memoryG) {
        this.CPU = CPU;
        Screen = screen;
        SYstem = system;
        MemoryG = memoryG;

    }

    @Override
    public void OS() {
        System.out.println("这个电脑系统是：");
        System.out.println(this.SYstem);
    }

    @Override
    public void MemoryG() {
        System.out.println("这个电脑内存是:");
        System.out.println(this.MemoryG);

    }

    @Override
    public void Screen() {
        System.out.println("这个屏幕是:");
        System.out.println(this.Screen);
    }

    public void describe() {
       this.OS();
       this.MemoryG();
       this.Screen();

    }

    public void describe(boolean i) {
      this.describe();
      this.Fix(i);
      this.PUBG(i);
      this.PhotoShop(i);


    }

}
