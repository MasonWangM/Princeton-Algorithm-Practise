package com.company.chapter2;

public class Selection {
    public interface Comparator {
        boolean compare(int a, int b);
    }

    public static class AscendingComparator implements Comparator {
        public boolean compare(int a, int b) {
            return a < b;
        }
    }

    public static class DescendingComparator implements Comparator {
        public boolean compare(int a, int b) {
            return a > b;
        }
    }

    public static void sort(int[] array, boolean isAscending) {
        Comparator comparator =
                isAscending ? new AscendingComparator()
                        : new DescendingComparator();
        for (int i = 0; i < array.length; i++) {
            int target = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], array[target])) {
                    target = j;
                }
            }
            exch(array, i, target);
        }
    }

    private static void exch(int[] array, int i, int j) {
        int swap = array[i];
        array[i] = array[j];
        array[j] = swap;
    }
}

