package com.leetcode.array;

import java.util.Arrays;

public class GenerateMatrix {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    private static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int loop = 0;
        int i,j;
        int count = 1;
        int start = 0;

        while (loop < n / 2) {
            loop++;
            for ( j = start; j < n - loop; j++) {
                matrix[start][j] = count;
                count++;
            }

            for ( i = start; i < n - loop; i++) {
                matrix[i][j] = count;
                count++;
            }

            for (; j >= loop; j--) {
                matrix[i][j] = count;
                count++;
            }
            for (; i >= loop; i--) {
                matrix[i][j] = count;
                count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            matrix[start][start] = count;
        }
        return matrix;
    }

}

