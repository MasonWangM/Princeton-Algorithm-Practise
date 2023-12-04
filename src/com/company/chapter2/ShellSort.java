package com.company.chapter2;
/**
 希尔排序原理：
 首先它是对插入排序的优化，对于插入排序而言移动成本过高
 （1）因此希尔排序首先按照一定的希尔间隔h，将元素进行成对比较和排序
 比如元素 2 ，7 ，4 ，5 ，3，8，如果间隔为3那么此时2，5为一对，7，3为一对，4，8为一对
 此时2，5顺序正确，7，3不正确则需要交换，4，8正确则不交换
 （2）降低希尔间隔
 （3）当希尔间隔降低为1时，变为了插入排序
 核心点在于希尔间隔的选取：
 最早的希尔间隔为：希尔原始间隔序列，这是最初由希尔提出的间隔序列，间隔为 N/2, N/4, ..., 1。
 虽然简单，但它不是最有效的，因为它产生的部分排序可能对最终排序不是很有帮助。
 Hibbard的间隔序列：Hibbard建议使用形如 1, 3, 7, 15, ..., 2^k - 1 的间隔序列。
 这个序列的优点是，在最坏的情况下，它能将希尔排序的时间复杂度降低到 O(N^(3/2))。
 Knuth的间隔序列：Knuth提出的间隔序列为 1, 4, 13, 40, ...，即形如 3x + 1 的序列。
 使用这个序列的希尔排序在平均情况下的性能非常好。
 Sedgewick的间隔序列：Sedgewick提出了几种不同的间隔序列，
 其中一种是 1, 5, 19, 41, 109, ...。这个序列在平均情况下可以提供很好的性能。
 注意：目前仍未出现理想的希尔间隔
 **/
public class ShellSort {

    public static void sort(int[] array) {
       int n = array.length;
       int h = 1;
       while (h < n/3) h = 3 * h +1; //获取希尔间隔，采用Knuth的间隔序列
       while (h >= 1){
           for (int i = h; i < n; i++) { //从h开始
               for (int j =i; j >=h && less(array[j], array[j - h]); j = j- h)
                   //如果j -h比j对应的大就要交换顺序
                   // j - h则是对下一组元素进行排序
                   exch(array, j ,j-h);
           }
           h = h /3;
       }
    }

    private static boolean less(int i, int j) {
        return i < j;
    }


    private static void exch(int[] array, int i, int j) {
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}
