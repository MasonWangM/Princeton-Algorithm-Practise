package com.sort;
/**
 冒泡排序
 一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 这个过程会重复进行，直到再也不需要交换
 时间复杂度：O(n^2)
 稳定性好
 * **/
public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     在排序时候可能当前已经为有序态，但是仍要继续遍历
     因此需要提前终止遍历
     判断在一轮完整的循环中有没有交换，如果都没有那么此时已经有序
     终止遍历
     **/
    public static void sort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]){
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    /**
     3在2的基础上压缩有序边界，在正常的算法中，每次遍历到length - 1 -i终止
     但是有可能前面的若干元素已经有序了，无需继续到终点
     因此可以提前终止
     记录下一轮遍历中最后一次交换的index就是边界
     遍历后border为index，之后的轮次最多遍历到border
     **/
    public static void sort3(int[] array) {
        int board = array.length - 1;
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            int lastIndex = 0;
            for (int j = 0; j < board; j++) {
                if (array[j] > array[j + 1]){
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                    lastIndex = j;
                }
            }
            board = lastIndex;
            if (isSorted) break;
        }
    }

    /**
     鸡尾酒排序：
     冒泡排序是依次从左往右进行排序，而鸡尾酒排序则左右交替进行
     即从左往右一次，从右向左一次
     **/
    public static void sort4(int[] array) {
        int boardToRight = array.length - 1;
        int boardToLeft = 0;
        for (int i = 0; i < array.length/2; i++) {
            boolean isSorted = true;
            int lastIndexR = 0;
            int lastIndexL = 0;
            for (int j = 0; j < boardToRight; j++) {
                if (array[j] > array[j + 1]){
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                    lastIndexR = j;
                }
            }
            boardToRight = lastIndexR;
            isSorted = true;
            for (int k = boardToRight; k > boardToLeft; k--) {
                if (array[k] < array[k - 1]){
                    var temp = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = temp;
                    isSorted = false;
                    lastIndexL = k;
                }
            }
            boardToLeft = lastIndexL;
            if (isSorted) break;
        }

    }
}
