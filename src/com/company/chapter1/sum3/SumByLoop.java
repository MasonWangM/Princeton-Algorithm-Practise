package com.company.chapter1.sum3;

import java.util.List;
/*
最暴力用三层循环求解sum3方法复杂度为N的三次方
* **/
public class SumByLoop {
    public int countSumResult(List<Integer> ints) {
        int count = 0;
        int length = ints.size();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length ; k++) {
                    if ((ints.get(i) + ints.get(j) + ints.get(k) == 0)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
