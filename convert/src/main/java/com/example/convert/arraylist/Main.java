package com.example.convert.arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ vector 는 Java 의 ArrayList 로 대체 할 수 있다.
         */

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 추가
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // 특정 위치에 추가
        arrayList.add(0, 0);

        // 삭제
        arrayList.remove(Integer.valueOf(1)); // 요소를 삭제
        arrayList.remove(0); // 인덱스로 삭제

        // 요소 접근
        Integer element = arrayList.get(0);// 인덱스로 접근
        System.out.println(element); // 2

        // 반복
        for (Integer num : arrayList) {
            System.out.println(num);
        }
//        arrayList.forEach(System.out::println);
//        arrayList.stream().forEach(System.out::println);
    }
}
