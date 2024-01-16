package com.leetcode.hashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> setOfNums1 = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            setOfNums1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (setOfNums1.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }
        return resultSet.stream().mapToInt(x -> x).toArray();


    }
}
