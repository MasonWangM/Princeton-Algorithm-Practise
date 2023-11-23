package com.company.chapter1.binarySearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 5, 10, 17, 33, 78, 99);
        System.out.println(binarySearch(integers, 10));//2
        System.out.println(binarySearch(integers, 88));//-1
    }

    public static int binarySearch(List<Integer> ints, int key) {
        if (ints.isEmpty()) return -1;
        if (ints.size() == 1) {
            if (ints.get(0) == key) return 0;
            else return -1;
        }
        int start = 0;
        int end = ints.size() - 1;
        while (start <= end) {
            int mid = end - start / 2;
            if (key < ints.get(mid)) end = mid - 1;
            else if (key > ints.get(mid)) start = mid + 1;
            else return mid;
        }
        return -1;

    }
}

