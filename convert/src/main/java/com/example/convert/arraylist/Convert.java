package com.example.convert.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert {

    public static void main(String[] args) {

        /**
         * Array to ArrayList
         */


        // case 1
        // Arrays.asList(T[] a)
        Integer[] integers1 = new Integer[10];
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(integers1));

        // case 2
        // stream, immutable
        int[] ints1 = new int[10];
        List<Integer> list1 = Arrays.stream(ints1)
                .boxed() // int -> Integer
                .toList();

        // case 3
        // stream, mutable
        int[] ints2 = new int[10];
        ArrayList<Integer> arrayList2 = Arrays.stream(ints2)
                .boxed() // int -> Integer
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
