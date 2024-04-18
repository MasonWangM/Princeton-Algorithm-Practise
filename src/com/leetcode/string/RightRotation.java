package com.leetcode.string;

public class RightRotation {
    public static void main(String[] args) {
        String input = "abcdefg";
        System.out.println(rightRotate(2, input));
    }
    public static String rightRotate(int k, String s){
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        if (length <= k) return s;
        int start = length - k;
        String front = s.substring(0, start);
        String end = s.substring(start, length);
        return end + front;
    }
}
