package com.example.convert.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ 의 map 은 Java 의 TreeMap 으로 대체할 수 있다.
         */

        TreeMap<String, Integer> treeMap = new TreeMap<>(); // Map<String, Integer> 로 선언하면 first, last 관련 메서드 이용 불가

        // 추가
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);

        // 삭제
        treeMap.remove("apple");

        // 찾기 및 접근
        if(treeMap.containsKey("banana")) {
            Integer value = treeMap.get("banana");
            System.out.println(value); // 2
        }

        // 접근
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry(); // 첫번째 요소 (가장 낮은 요소, 정렬은 기본이 키 기준 오름차순이다.)
        System.out.println("first key : " + firstEntry.getKey() + ", value : " + firstEntry.getValue());
        Map.Entry<String, Integer> lastEntry = treeMap.lastEntry(); // 마지막 요소 (가장 높은 요소, 정렬은 기본이 키 기준 오름차순이다.)
        System.out.println("last key : " + lastEntry.getKey() + ", value : " + lastEntry.getValue());


        // 반복
        for (String key : treeMap.keySet()) {
            System.out.println("key : " + key + ", value : " + treeMap.get(key));
        }
//        treeMap.forEach(
//                (k, v) -> System.out.println("key : " + k + ", value : " + v)
//        );
//        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }
    }
}
