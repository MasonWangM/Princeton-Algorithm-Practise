package com.leetcode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * <p>
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * 示例 1:
 * <p>
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 示例 2:
 * <p>
 * 输入: strs = [""]
 * 输出: [[""]]
 * 示例 3:
 * <p>
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 **/

/**
 * 解题思路，将每个String拆分，然后排序聚合成一个string，根据这个进行group
 * 注意：
 * 1.为什么要用new String（）而不用toString，因为对于array来说toString返回的是hash
 * 2.new String(charArray)会生成char组合的字符串，而不是会带[]
 * 3.Collectors.groupingBy返回的是一个Map其中key是排序后的string,也就是return new String(charArray);
 * 而value是原本数值的一个list
 *
 * **/

public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>((Arrays.stream(strs).collect(Collectors.groupingBy(
                str -> {
                    char[] charArray = str.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }
        )).values()));
    }
}
