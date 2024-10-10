package com.leetcode.hot100;
/***
 *给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 *
 * 说明：你不能倾斜容器。
 *
 * ***/

/***
 解题思路：最多的水量为两个板中较短的一个板子，乘两板之间的距离
 通过双指针，从两侧开始，此时最宽，向内移动板子，由于两个板子距离必然变短，那么移动板子则有如下俩中结果：
 （1）板子变短，那么面积必然变少
 （2）板子变长，板子长了但距离短了因此面积可能变大也可能变小
 左右双指针，向中间逼近，每次让较短的板移动，这样才有机会凑双长板最大，两板相遇停止
 *
 * ***/
public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
