package com.ad.homework03;

import com.ad.homework03.supermarket.Computer;

import java.util.Random;

public class test04 {
    public static void main(String[] args) {

        Random r = new Random();
        String cpu[]={"AMD","Intel","M1","Snapdragon"};
        String screen[]={"Samsung","LG","BOE","TCL"};
        String SYS[]={"IOS","Win","Andoird","Hamorny"};

        boolean i=true;

        Computer c = new Computer("AMD", "三星", "Win11", 8);


        c.describe();
        for (int j = 0; j <5 ; j++) {
            Computer m= new Computer(cpu[j], screen[j], SYS[j],16);
           m.describe(i);

        }


    }
}
