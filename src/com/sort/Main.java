package com.sort;

import com.sort.util.FileUtil;
import com.sort.util.TimeUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = FileUtil.getArray("src/com/sort/JavaIntegerList10000.txt");
        TimeUtil.measureTime(()-> BubbleSort.sort(array));
        System.out.println(arrayToString(array));

        int[] array2 = FileUtil.getArray("src/com/sort/JavaIntegerList10000.txt");
        TimeUtil.measureTime(()-> BubbleSort.sort2(array2));
        System.out.println(arrayToString(array2));

        int[] array3 = FileUtil.getArray("src/com/sort/JavaIntegerList10000.txt");
        TimeUtil.measureTime(()-> BubbleSort.sort3(array3));
        System.out.println(arrayToString(array3));

        int[] array4 = FileUtil.getArray("src/com/sort/JavaIntegerList10000.txt");
        TimeUtil.measureTime(()-> BubbleSort.sort4(array4));
        System.out.println(arrayToString(array4));

        int[] array5 = FileUtil.getArray("src/com/sort/JavaIntegerList10000.txt");
        TimeUtil.measureTime(()-> QuickSort.sort(array5, 0, array5.length - 1));
        System.out.println(arrayToString(array5));

        int[] array6 = FileUtil.getArray("src/com/sort/JavaIntegerList10000.txt");
        TimeUtil.measureTime(()-> QuickSort.sort2(array6, 0, array6.length - 1));
        System.out.println(arrayToString(array6));
    }

    public static String arrayToString(int[] array) {
        if (array == null) return "null";
        if (array.length == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < array.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}
