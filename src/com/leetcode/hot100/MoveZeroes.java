package com.leetcode.hot100;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作
 *
 * **/

/**
 解法1:
 类似冒泡排序暴力求解，让0慢慢浮上来，外循环开始遍历数组，发现0则开始内循环，
 这个0开始和遇到的所有非0数交换位置，最终使得所有0都排在最后

 解法2:
 快速排序法，在快速排序中，我们会取一个中间值，把这个数值的左边放小于它的数，而右边放大于他的数，此时中间值就处于有序状态
 而在本题中我们有i，j两个指针，i快j慢，两者同时出发，i每轮都会增加，j只有在i!=0时，才会增加，如果都不为0，那么i,j则共同前进
 直到出现第一个0点，此时j停留在0点，i继续遍历直到下一个非0点于j进行交换。交换后j+1指向下一个0点，i则继续遍历找下一个非0点

 * **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int currentZeroIndex = i;
                for (int j = i; j < nums.length ; j++) {
                    if (nums[j] != 0) {
                        swap(nums, currentZeroIndex, j);
                        currentZeroIndex = j;
                    }
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
               if (nums[j] == 0){swap(nums, j, i);}
                j++;
            }
        }
    }

    private void swap(int[] nums, int currentZeroIndex, int i) {
        int temp = nums[i];
        nums[i] = nums[currentZeroIndex];
        nums[currentZeroIndex] = temp;
    }

}
