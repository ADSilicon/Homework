package com.liang.adtest;

public class encode {
    public static void main(String[] args) {
        String code="1983";
        int[] chr = new int[code.length()];
        int[] chr2 = new int[code.length()];
        for (int i = 0; i < code.length(); i++) {
            String str ="";
            str+=code.charAt(i);
            int num=Integer.parseInt(str);
            chr[i]=(num+5)%10;
            System.out.print(i==chr.length-1?chr[i]:chr[i]+",");
        }
        for (int j = 0,k= code.length()-1; j < code.length(); j++,k--) {
            chr2[j]=chr[k];
        }
        System.out.println();
        for (int z = 0; z < code.length(); z++) {
            System.out.print(z==chr2.length-1?chr2[z]:chr2[z]+",");

        }
    }
}
