package com.example.convert.array;

public class Main {

    public static void main(String[] args) {

        /**
         * 크기가 정해진 배열은 Java 에서는 int[] 와 같이 사용할 수 있다.
         */

        int size = 10;

        int[] ints = new int[size];
        boolean[] booleans = new boolean[size];
        char[] chars = new char[size];

        // 수정
        ints[5] = 5;

        // 길이
        int length = ints.length;

        // 반복
        for(int i = 0; i < size; i++) {
            System.out.println("int : " + ints[i]); // 0 으로 초기화됨
            System.out.println("boolean : " + booleans[i]); // false 로 초기화됨
            System.out.println("char : " + chars[i]); // '\0' 으로 초기화
        }
    }
}
