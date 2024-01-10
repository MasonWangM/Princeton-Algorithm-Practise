package com.leetcode.array;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ints = sortedSquares(nums);
        for (int num : ints) {
            System.out.println(num);
        }
        int[] ints2 = sortedSquaresBetter(nums);
        for (int num : ints2) {
            System.out.println(num);
        }
    }

    private static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(num -> num * num).sorted().toArray();
    }

    private static int[] sortedSquaresBetter(int[] nums) {
        int[] squaredNums = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare >= rightSquare) {
                squaredNums[index] = leftSquare;
                left++;
            } else {
                squaredNums[index] = rightSquare;
                right--;
            }
            index--;
        }
        return squaredNums;
    }
}
