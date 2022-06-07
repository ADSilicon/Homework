package com.liang.adtest;

import java.util.Random;

public class Random_code {
    public static void main(String[] args) {
    String ret;
        for (int i = 0; i <20 ; i++) {
            ret=code(5);
            System.out.println(ret.toString());
        }

    }

    public static String code(int n){
        String num ="";
        String ret ="";
        Random r=new Random();
        for (int i = 97; i <=97+26; i++) {
            num+=(char)i;
        }
        for (int j = 65; j <=65+26; j++) {
            num+=(char)j;
        }
        num+="0123456789";
        for (int m = 0; m < n; m++) {
            int rnum=r.nextInt(num.length());
            ret+=num.charAt(rnum);
        }
        return ret;
    }
}
