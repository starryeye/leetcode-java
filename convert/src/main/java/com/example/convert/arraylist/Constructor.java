package com.example.convert.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constructor {

    public static void main(String[] args) {

        /**
         * ArrayList 의 생성자 3가지
         *
         * 참고
         * 특정 값으로 초기화하는 생성자는 존재하지 않는다...
         */

        ArrayList<Integer> arrayList1 = new ArrayList<>(); // empty arrayList
        ArrayList<Integer> arrayList2 = new ArrayList<>(10); // 크기를 미리 할당한 케이스, 초기값 0
        ArrayList<Integer> arrayList3 = new ArrayList<>(before()); // Collection 을 이용한 케이스

        ArrayList<Integer> arrayList4 = Stream.generate(() -> -1)
                .limit(5)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static Collection<Integer> before() {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        return set;
    }
}
