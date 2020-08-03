package com.algorithm.sort;

public class InsertionSort extends SortBase {
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.test(new Integer[]{8, 4, 5, 2, 9, 7, 1, 3, 6});
    }
}
