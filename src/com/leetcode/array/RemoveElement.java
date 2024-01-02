package com.leetcode.array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(array, val));
    }
    private static int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}
