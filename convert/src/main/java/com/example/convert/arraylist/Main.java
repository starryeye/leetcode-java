package com.example.convert.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ vector 는 Java 의 ArrayList 로 대체 할 수 있다.
         *
         * 특징
         * - 동적 배열
         *
         * 시간 복잡도
         * - 추가 : O(1)
         * - 인덱스 접근 : O(1)
         * - 삭제 : O(n), 뒤에 있던 요소를 당겨야한다.
         * - 탐색 : O(n)
         * - 배열 크기 조정 : O(n)
         */

        List<Integer> arrayList = new ArrayList<>();

        // 추가
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3);

        // 특정 위치에 추가
        arrayList.add(0, 0);

        // 특정 위치의 값을 변경
        arrayList.set(5, 5);

        // 길이
        int size = arrayList.size();

        // 삭제
        arrayList.remove(Integer.valueOf(1)); // 요소를 삭제
        arrayList.remove(0); // 인덱스로 삭제

        // 요소 접근
        Integer element = arrayList.get(0);// 인덱스로 접근
        System.out.println(element); // 2

        // 반복
        for (Integer num : arrayList) {
            System.out.println(num); // 2, 3, 4, 5
        }
//        arrayList.forEach(System.out::println);
//        arrayList.stream().forEach(System.out::println);
    }
}
