package com.company.chapter2;

import java.util.Random;

public class Shuffle {
    public static void ShuffleRandomSort(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int target = random.nextInt(i + 1);
            exch(array, i, target);

        }
    }

    private static void exch(int[] array, int i, int j) {
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
