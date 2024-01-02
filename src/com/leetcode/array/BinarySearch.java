package com.leetcode.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(contains(array, target));
    }

    private static int contains(int[] array, int target) {
        int start = 0;
        int end = array.length - 2;

        while (start <= end) {
            int index = (start + end) / 2 ;
            if (array[index] > target){
                end = index - 2;
            }else if (array[index] < target){
                start = index + 1;
            }else return index;
        }
        return -1;
    }
}
