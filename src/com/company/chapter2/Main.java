package com.company.chapter2;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 5, 6, 7, 9, 10, 10, 78, 3, 5, 6};
        Selection.sort(array, true);
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("==============================");
        Selection.sort(array, false);
        for (int i : array) {
            System.out.println(i);
        }

        int[] arrayForInsertion = {9, 2, 3, 5, 6, 7, 9, 10, 10, 78, 3, 5, 6};
        Insertion.sort(arrayForInsertion);
        System.out.println("==============================");
        for (int i : arrayForInsertion) {
            System.out.println(i);
        }

        int[] arrayForShell = {9, 2, 3, 5, 6, 7, 9, 10, 10, 78, 3, 5, 6};
        ShellSort.sort(arrayForShell);
        System.out.println("==============================");
        for (int i : arrayForShell) {
            System.out.println(i);
        }
    }
}
