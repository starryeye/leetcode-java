package com.example.convert.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ 의 unordered_map 은 Java 의 HashMap 로 대체할 수 있다.
         */

        Map<String, Integer> map = new HashMap<>();

        // 추가
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // 삭제
        map.remove("one");

        // 찾기 및 접근
        if(map.containsKey("two")) {
            Integer value = map.get("two");
            System.out.println(value); // 2
        }

        // 반복 및 접근
        for (String key : map.keySet()) {
            System.out.println("key : " + key + ", value : " + map.get(key));
        }
//        map.forEach(
//                (k, v) -> System.out.println("key : " + k + ", value : " + v)
//        );
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }
    }
}
