package com.leetcode.hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "aabbc";
        String t = "aabbb";
        System.out.println(isAnagramByArray(s, t));

    }

    public static boolean isAnagramByMap(String s, String t) {
        char[] charsOfS = s.toCharArray();
        char[] charsOfT = t.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char letter : charsOfS) {
            Integer integer = sMap.get(letter);
            if (integer == null) {
                sMap.put(letter, 1);
            } else {
                sMap.put(letter, integer.intValue() + 1);
            }
        }

        for (char letter : charsOfT) {
            Integer integer = tMap.get(letter);
            if (integer == null) {
                tMap.put(letter, 1);
            } else {
                tMap.put(letter, integer.intValue() + 1);
            }
        }
        return sMap.equals(tMap);

    }

    public static boolean isAnagramByArray(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] countArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            countArray[s.charAt(i) - 'a']++;
            countArray[t.charAt(i) - 'a']--;
        }
        return !Arrays.stream(Arrays.stream(countArray).toArray()).anyMatch(num -> num != 0);

    }
}
