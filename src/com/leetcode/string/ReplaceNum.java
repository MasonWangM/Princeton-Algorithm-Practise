package com.leetcode.string;
/***
 给定一个字符串 s，它包含小写字母和数字字符，请编写一个函数，将字符串中的字母字符保持不变，而将每个数字字符替换为number。

 例如，对于输入字符串 "a1b2c3"，函数应该将其转换为 "anumberbnumbercnumber"。

 对于输入字符串 "a5b"，函数应该将其转换为 "anumberb"

 输入：一个字符串 s,s 仅包含小写字母和数字字符。

 输出：打印一个新的字符串，其中每个数字字符都被替换为了number

 样例输入：a1b2c3

 样例输出：anumberbnumbercnumber

 数据范围：1 <= s.length < 10000。
 **/
public class ReplaceNum {

    public static final String NUMBER = "number";

    public static void main(String[] args) {
        String input1 = "a1b2c3";
        String result1 = "anumberbnumbercnumber";
        String input2 = "a5b";
        String result2 = "anumberb";
        assert replaceNum(input1).equals(result1);
        assert replaceNum(input2).equals(result2);
    }

    private static String replaceNum(String input) {
        char[] inputCharArray = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : inputCharArray) {
            if (isNum(c)) {
                stringBuilder.append(NUMBER);
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean isNum(char c) {
        return (c >= '0' && c <='9');
    }
}
