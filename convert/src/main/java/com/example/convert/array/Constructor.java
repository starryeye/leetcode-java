package com.example.convert.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class Constructor {

    public static void main(String[] args) {

        /**
         * 배열을 생성하고 값을 할당해본다.
         *
         * 참고
         * 특정 값으로 초기화와 동시에 생성하는 생성자는 존재하지 않는다...
         */
        int size = 5;

        // case 1
        // 생성
        int[] ints = new int[size];
        // 전역 할당
        Arrays.fill(ints, -1);
        // 출력
        for (int element : ints) {
            System.out.println(element);
        }


        // case 2
        // 생성
        Integer[] array = Stream.generate(() -> -2)
                .limit(size)
                .toArray(Integer[]::new);
        // 출력
        for (Integer element : array) {
            System.out.println(element);
        }

        // case 3
        String[] strings = new String[]{"hello", "world"};
        for (String element : strings) {
            System.out.println(element);
        }
    }
}
