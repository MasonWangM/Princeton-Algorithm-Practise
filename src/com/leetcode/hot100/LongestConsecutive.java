package com.leetcode.hot100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/***
 *给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。

 * 示例 1：
 *
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * 示例 2：
 *
 * 输入：nums = [0,3,7,2,5,8,4,6,0,1]
 * 输出：9
 * ***/
/***
 解法1:
 1.注意先排除null和empty，排除后长度就至少为1了，因此maxLen应该至少从1开始计算
 2.注意去重复
 3.利用当前值+1=当前索引+1判断是否连续，注意不要下标越界，特别是在有+1的场景下，一定要到length就停下

 解法2：
 1.跳出array本身，对于一个最长序列来说，就是判断起点，然后判断这些数据集合里有没有起点的后续，最后选择最大的连续即可
 2.如果一个数字减1没有数字，说明他就是起点，只需要查看它后续的数字是否在集合里

 * ***/
public class LongestConsecutive {
    public int longestConsecutive1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] sortedArray = Arrays.stream(nums).distinct().sorted().toArray();
        int maxLen = 1;
        int currentIndex = 0;
        while (currentIndex < sortedArray.length) {
            int currentMaxLen = 1;
            while (currentIndex < sortedArray.length-1 && sortedArray[currentIndex] + 1 == sortedArray[currentIndex + 1]) {
                currentIndex++;
                currentMaxLen++;
            }
            currentIndex++;
            maxLen = Math.max(maxLen, currentMaxLen);
        }
        return maxLen;
    }

    public int longestConsecutive2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int maxLen = 1;
        for (int num : numSet) {
            int currentMaxLen = 1;
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentMaxLen++;
                }
            }
            maxLen = Math.max(maxLen, currentMaxLen);
        }
        return maxLen;
    }
}
