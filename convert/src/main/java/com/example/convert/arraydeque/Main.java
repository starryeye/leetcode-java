package com.example.convert.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ stack 은 Java 의 ArrayDeque 로 대체하면 편하다.
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
