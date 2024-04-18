package com.sort;

/**
 快速排序算法采用分治法（Divide and Conquer）的策略来实现排序。
 快速排序的基本思想是通过一个划分操作将数据分为两部分，
 其中一部分的所有数据都比另一部分的所有数据要小，
 然后再递归地对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 时间复杂度 O(nlogn)
 稳定性：不稳定
 过程：
 选取一个基准放在中间，比它小的放前面，比它大的放后面，此时被分成了两个数组，继续递归操作
 直到数组为1或者数组为0递归结束
 * **/
public class QuickSort {
    public static void sort(int[] array, int start, int end) {
        if (start >= end) return;
        int partition = partition(array, start, end);
        sort(array, start, partition -1);
        sort(array, partition + 1, end);
    }

    public static void sort2(int[] array, int start, int end) {
        if (start >= end) return;
        int partition = partition2(array, start, end);
        sort2(array, start, partition -1);
        sort2(array, partition + 1, end);
    }
    /**
     * 双边循环法
     * 初始化两个指针，left 指针指向数组第一个元素的位置（除了基准元素），
     * right 指针指向数组最后一个元素的位置。
     * 进行双边循环：
     * right 指针向左移动，直到找到一个小于基准的元素。
     * left 指针向右移动，直到找到一个大于基准的元素。
     * 如果 left 指针小于 right 指针，交换这两个元素。
     * 当 left 指针大于等于 right 指针时，结束循环，并将基准元素与 left 和 right 重合点（或 right 指针所指向的元素）交换位置。
     ***/
    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int left = start + 1;
        int right = end;
        while (left <= right){
            while (left <= right && array[left] <= pivot){
                left++;
            }
            while (left <= right && array[right] >= pivot){
                right--;
            }
            if (left < right) {
                swap(array, left, right);
            }
        }
        swap(array, start, right);
        return right;
    }
    /**
     * 定义指针mark指向起始队列，指针最终表示小于基准元素的边界
     * 从基准元素的下一位进行遍历，如果大于基准元素则继续遍历
     * 如果小于基准元素则指针右移，新元素和指针交换
     * 理解：
     * 0-mark指针相当于小于基准元素的容器，初始为0
     * 随着遍历不断扩容并填充
     * **/
    private static int partition2(int[] array, int start, int end) {
        int mark = start;
        int pivot = array[start];
        for (int i = start+1; i <= end ; i++) {
            if (array[i] < pivot){
                mark++;
                swap(array, mark, i);
            }
        }
        swap(array, start , mark);
        return mark;
    }

    private static void swap(int[] array, int i, int j){
        var temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
