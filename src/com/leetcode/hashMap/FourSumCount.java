package com.leetcode.hashMap;

import java.util.HashMap;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int length = nums1.length;
        HashMap<Integer, Integer> twoSumMap = new HashMap<>();
        for (int numInOne : nums1) {
            for (int numInTwo : nums2) {
                int sum = numInOne + numInTwo;
                twoSumMap.put(sum, twoSumMap.getOrDefault(sum, 0) + 1);
            }
        }

        int resultCount = 0;

        for (int numInThree: nums3) {
            for (int numInFour: nums4) {
                int key = 0 - numInThree - numInFour;
                resultCount += twoSumMap.getOrDefault(key, 0);
            }
        }
        return resultCount;
    }
}
