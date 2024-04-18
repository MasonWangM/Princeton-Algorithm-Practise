package com.leetcode.string;

public class ReverseStr2 {
    public static void main(String[] args) {
        String s = "abcdefg"; // bacdfeg
        int k = 2;
        char[] chars = s.toCharArray();
        reverseString(chars, 2, 4);
        System.out.println(new String(chars));
        System.out.println(reverseStr(s, 2));
    }

    public static String reverseStr(String s, int k) {
        char[] stringChars = s.toCharArray();
        int length = stringChars.length;
        if (length < k) {
            reverseString(stringChars, 0, length - 1);
        }
        /**
         start = 2nk,n = 0 ,1 ,2....
         end = (2n + 1)k = k, 3k,5k
         **/
        for (int i = 0; length > (2 * i + 1) * k; i++) {
            int start = 2 * i * k;
            int end = Math.min(((2 * i) + 1) * k - 1, length - 1);
            reverseString(stringChars, start, end);
        }
        return new String(stringChars);
    }


    /**
     * 传递启始坐标和结束坐标,均为闭区间
     **/
    private static void reverseString(char[] s, int start, int end) {
        for (int i = 0; i < (end - start) + 1 / 2; i++) {
            char temp = s[start + i];
            s[start + i] = s[end - i];
            s[end - i] = temp;
        }
    }
}
