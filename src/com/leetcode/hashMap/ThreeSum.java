package com.leetcode.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> sortedNums = Arrays.stream(nums)
                .boxed().sorted().collect(Collectors.toList());
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (sortedNums.isEmpty() || sortedNums.get(0) > 0) return result;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && sortedNums.get(i) == sortedNums.get(i - 1)) continue;
            int start = i + 1;
            int end = sortedNums.size() - 1;
            while (start < end) {
                int sum = sortedNums.get(i) + sortedNums.get(start) + sortedNums.get(end);
                if ((sum > 0)) {
                    end--;
                } else if (sum == 0) {
                    result.add(List.of(sortedNums.get(i), sortedNums.get(start), sortedNums.get(end)));
                    while (start < end && sortedNums.get(start).equals(sortedNums.get(start + 1))) {
                        start++;
                    }
                    while (start < end && sortedNums.get(end).equals(sortedNums.get(end - 1))) {
                        end--;
                    }
                    end--;
                    start++;
                } else {
                    start++;
                }
            }
        }
        return result;
    }
}
