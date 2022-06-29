package com.ad.homework04.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintC(addEle(new ArrayList()));

        PrintC(addEle(new MyArrayList()));

        PrintL((List) addEle(new ArrayList()));
        PrintL((List) addEle(new MyArrayList()));
        PrintL((List) addEle(new MylinkedList()));

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
    public static void PrintL(List list){
        System.out.println();
        System.out.println("输出" + list.getClass() + "中的元素，共" + list.size() + "个");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
