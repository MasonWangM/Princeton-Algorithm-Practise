package com.company.chapter2;

public class Insertion {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(array[j], array[j-1])) {
                    exch(array, j, j -1);
                }
            }
        }
    }


    private static boolean less(int i, int j) {
        return i < j;
    }


    private static void exch(int[] array, int i, int j) {
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
