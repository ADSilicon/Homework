package com.ad.homework04.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class UseSet {
    public static void main(String[] args) {
       PrintC(addEle(new HashSet()));
        PrintC(addEle(new ArrayList()));

    }
    public static Collection addEle(Collection collection){

        for (int i = 0; i < 10; i++) {
            collection.add("str"+(i%5));
        }
        return collection;
    }
    public static void PrintC(Collection collection){
        System.out.println();
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");

        try {
            for (Object o : collection) {
                System.out.println(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
