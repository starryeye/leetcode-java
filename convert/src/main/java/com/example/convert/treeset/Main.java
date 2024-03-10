package com.example.convert.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ 의 set 은 Java 의 TreeSet 으로 대체할 수 있다.
         *
         * - 레드 블랙 트리
         * - 키 중복 없음
         * - 순서 보장
         *
         * 시간 복잡도
         * - 추가 : O(logN)
         * - 삭제 : O(logN)
         * - 탐색 : O(logN)
         */

        TreeSet<Integer> treeSet = new TreeSet<>(); // Set<Integer> 로 선언하면 first, last 의 메서드 이용 불가

        // 추가
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        // 삭제
        treeSet.remove(1);

        // 찾기
        if(treeSet.contains(2)) {
            System.out.println("set contain 2");
        }

        // 접근
        Integer first = treeSet.first(); // 첫번째 요소 (가장 낮은 요소, 정렬은 기본이 오름차순이다.)
        System.out.println(first); // 2
        Integer last = treeSet.last(); // 마지막 요소 (가장 높은 요소, 정렬은 기본이 오름차순이다.)
        System.out.println(last); // 3

        // 반복
        for (Integer num : treeSet) {
            System.out.println(num);
        }
//        treeSet.forEach(System.out::println);
//        treeSet.stream().forEach(System.out::println);
    }
}
