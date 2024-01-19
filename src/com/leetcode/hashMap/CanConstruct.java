package com.leetcode.hashMap;

import java.util.Arrays;

public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineArray = new int[26];
        char[] charsForM = magazine.toCharArray();
        for (int i = 0; i < charsForM.length; i++) {
            magazineArray[charsForM[i] - 'a']++;
        }

        char[] charsForR = ransomNote.toCharArray();
        for (int i = 0; i < charsForR.length; i++) {
            magazineArray[charsForR[i] - 'a']--;
        }

       return !Arrays.stream(magazineArray).anyMatch(num -> num < 0);
    }
}
