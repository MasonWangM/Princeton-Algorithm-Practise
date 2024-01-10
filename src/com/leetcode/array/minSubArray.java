package com.leetcode.array;

public class minSubArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int[] nums2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target2 = 11;
        System.out.println(minSubArrayLen(target1, nums1));
        System.out.println(minSubArrayLen(target2, nums2));
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                minLength = Math.min(end - start + 1, minLength);
                sum -= nums[start];
                start++;
            }
        }
        if (minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }
}
