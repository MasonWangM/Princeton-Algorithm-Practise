package com.leetcode.hashMap;

import java.util.HashMap;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int length = nums1.length;
        HashMap<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length; j++) {
                int sum = nums1[i] + nums2[j];
                if (twoSumMap.containsKey(sum)) {
                    Integer count = twoSumMap.get(sum);
                    twoSumMap.put(sum, count + 1);
                }else {
                    twoSumMap.put(sum, 1);
                }
            }
        }

        int resultCount = 0;
        for (int i = 0; i < length; i++) {
            for (int l = 0; l < length; l++) {
                int key = 0 - nums3[i] - nums4[l];
                Integer count = twoSumMap.get(key);
                if (count != null){
                    resultCount += count;
                }
            }
        }
        return resultCount;
    }
}
