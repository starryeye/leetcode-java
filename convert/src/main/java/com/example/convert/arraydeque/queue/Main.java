package com.example.convert.arraydeque.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        /**
         * C++ queue 는 Java 의 ArrayDeque 로 대체할 수 있다.
         */

        Queue<Integer> queue = new ArrayDeque<>();

        // 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);


        // 제거
        Integer removed = queue.poll(); // 가장 먼저 들어간 요소 제거 및 반환
        System.out.println(removed); // 1


        // 가장 먼저 들어간 요소 접근
        Integer peek = queue.peek();
        System.out.println(peek); // 2


        // 반복
        queue.forEach(System.out::println);
//        queue.stream().forEach(System.out::println);
    }
}
