package com.ad.homework03;

import com.ad.homework03.supermarket.Phone;

public class ColorPhone extends Phone {
    private boolean ColorChange;

    public ColorPhone(String name, String id, int count, double soldPrice, double purchasePrice,
                                 double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
        ColorChange = false;
    }

    //todo 本类调用protected
    public void printCPU(){
        System.out.println(super.cpuHZ);
    }

}
