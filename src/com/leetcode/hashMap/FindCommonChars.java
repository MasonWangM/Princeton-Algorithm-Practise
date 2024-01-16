package com.leetcode.hashMap;

import java.util.ArrayList;
import java.util.List;

public class FindCommonChars {
    public static void main(String[] args) {
        String[] words = {"abdefgz", "bbb"};
        System.out.println(commonChars(words));
    }

    private static final int numsOfLetter = 26;

    public static List<String> commonChars(String[] words) {
        int [][] resultList = new int[words.length][];
        for (int i = 0; i < words.length; i++) {
            resultList[i] = (getLetterCount(words[i]));
        }
        int[] letterNum = new int[numsOfLetter];
        for (int i = 0; i < numsOfLetter; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < resultList.length; j++) {
                int num = resultList[j][i];
                if (num < min) min = num;
            }
            letterNum[i] = min;
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < numsOfLetter; i++) {
            for (int j = 0; j < letterNum[i]; j++) {
              char letter =  (char) (i + 'a');
              result.add(String.valueOf(letter));
            }
        }
        return result;
    }

    private static int[] getLetterCount(String word) {
        int[] counts = new int[numsOfLetter];
        for (int i = 0; i < word.length(); i++) {
            counts[word.charAt(i) - 'a']++;
        }
        return counts;
    }
}
