package com.leetcode.hashMap;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) return null;
        int[] results = new int[2];
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (numberMap.containsKey(target - currentNum)){
                results[1] = i;
                results[0] = numberMap.get(target - currentNum);
                break;
            }
            numberMap.put(currentNum, i);
        }
        return results;
    }
}
