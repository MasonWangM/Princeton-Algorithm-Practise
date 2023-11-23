package com.company.chapter1.sum3;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * 此时应该有10 -10 0
         * -8 7 1
         * 30 -10 -20
         * 共计三组满足要求
         **/
        List<Integer> intList = List.of(10, -10, 0, 30, 60, -20, -8, 7,1);

        SumByLoop sumByLoop = new SumByLoop();
        System.out.println(sumByLoop.countSumResult(intList));
    }
}
