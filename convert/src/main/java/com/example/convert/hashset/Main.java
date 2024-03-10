package com.example.convert.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ 의 unordered_set 은 Java 의 HashSet 으로 대체 할 수 있다.
         *
         * 특징
         * - 해시 테이블
         * - 순서 보장하지 않음
         * - 값 중복 없음
         *
         * 시간 복잡도
         * - 추가 : O(1)
         * - 삭제 : O(1)
         * - 탐색 : O(1)
         */

        Set<Integer> set = new HashSet<>();

        // 추가
        set.add(1);
        set.add(2);
        set.add(3);

        // 삭제
        set.remove(1);

        // 찾기
        if(set.contains(2)) {
            System.out.println("set contain 2");
        }

        // 반복
        for (Integer num : set) {
            System.out.println(num);
        }
//        set.forEach(System.out::println);
//        set.stream().forEach(System.out::println);
    }
}
