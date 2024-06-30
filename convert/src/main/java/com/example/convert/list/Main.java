package com.example.convert.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int size = 5;

        // 불변 리스트
        List<Integer> immutableList1 = Stream.generate(() -> -1)
                .limit(size)
                .toList();
        // 특정 위치의 값 변경
//        immutableList1.set(0, 0); // error !
        // 반복
        for (Integer element : immutableList1) {
            System.out.println(element);
        }


        // 불변 리스트 2
        List<Integer> immutableList2 = List.of(-1, -2, -3);
        // 특정 위치의 값 변경
//        immutableList2.set(0, 0); // error !
        // 반복
        for (Integer element : immutableList2) {
            System.out.println(element);
        }



        // 변경 가능 리스트 1
        List<Integer> mutableList = Stream.generate(() -> -1)
                .limit(size)
                .collect(Collectors.toCollection(ArrayList::new));
        // 특정 위치의 값 변경
        mutableList.set(0, 0);
        // 반복
        for (Integer element : mutableList) {
            System.out.println(element);
        }

        // 변경 가능 리스트 2
        List<Integer> mutableList2 = Arrays.asList(-1, -2, -3);
        // 특정 위치의 값 변경
        mutableList2.set(0, 0);
        // 반복
        for (Integer element : mutableList2) {
            System.out.println(element);
        }
    }
}
