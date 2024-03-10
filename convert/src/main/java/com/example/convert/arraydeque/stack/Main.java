package com.example.convert.arraydeque.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ stack 은 Java 의 ArrayDeque 로 대체하면 편하다.
         *
         * 특징
         * - First In Last out
         *
         * 시간복잡도
         * - 추가 : O(1)
         * - 삭제 : O(1)
         * - 탐색 : O(n), 스택은 탐색을 위한 자료구조가 아님
         * - top 접근 : O(1)
         */

        Deque<Integer> stack = new ArrayDeque<>();

        // 추가
        stack.push(1); // add 가 아님에 주의!!
        stack.push(2);
        stack.push(3);

        // 제거(pop)
        Integer top = stack.pop(); // 맨 위 요소가 제거 되고 리턴됨
        System.out.println(top); // 3

        // 맨 위 요소 접근
        Integer peek = stack.peek();
        System.out.println(peek); // 2

        // 반복
        stack.forEach(System.out::println);
//        stack.stream().forEach(System.out::println);
    }
}
