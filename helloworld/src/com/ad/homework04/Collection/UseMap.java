package com.ad.homework04.Collection;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<String,String> map= creatMap(99);

        System.out.println(map.get("key20"));
        System.out.println(map.get(new Object()));

        System.out.println(map.get("key10000"));

        map.put(null,"value of null");
        map.put("testnull", null);
        System.out.println("null key value:" + map.get(null));
        System.out.println("null value support:" + map.get("testnull"));

        String move="key5";

        System.out.println(move + "对应的值是：" + map.get(move));
        map.remove(move);

        System.out.println("执行删除操作后，" + move + "对应的值是：" + map.get(move));

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println("key为：" + e.getKey() + "，value为：" + e.getValue());
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        for (String s : map.keySet()) {
            System.out.println(s);
        }

    }

    private static Map<String, String> creatMap(int i) {
        Map<String,String> map=new HashMap<>();
        for (int j = 0; j < i; j++) {
            map.put("key"+j,String.valueOf(Math.random()));
        }
        return map;

    }
}
