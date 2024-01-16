package com.leetcode.hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> resultSet = new HashSet<Integer>();
        int number = n;
        while (!resultSet.contains(number)){
            if (number == 1) return true;
            resultSet.add(number);
            List<Integer> numbers = getNumbers(number);
            number = calculateNumber(numbers);
        }

        return false;

    }

    private static List<Integer> getNumbers(int number) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String stringNumber = String.valueOf(number);
        char[] chars = stringNumber.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = Integer.parseInt(String.valueOf(chars[i]));
            numbers.add(num);
        }
        return numbers;
    }

    private static int calculateNumber(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        return numbers.stream().mapToInt(x -> x * x).sum();
    }


}
