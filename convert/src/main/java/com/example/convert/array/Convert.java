package com.example.convert.array;

import java.util.ArrayList;
import java.util.List;

public class Convert {

    public static void main(String[] args) {

        /**
         * ArrayList to Array
         */

        // case 1
        // toArray(T[] a)
        List<Integer> arrayList1 = new ArrayList<>();
        Integer[] array1 = arrayList1.toArray(new Integer[0]); // Integer[0] 으로 하면 알아서 arrayList 길이만큼 할당된다.


        // case 2
        // stream
        List<Integer> arrayList2 = new ArrayList<>();
        int[] array2 = arrayList2.stream()
                .mapToInt(Integer::intValue) // Integer -> int
                .toArray();
    }
}
