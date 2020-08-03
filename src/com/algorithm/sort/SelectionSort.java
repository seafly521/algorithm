package com.algorithm.sort;

public class SelectionSort extends SortBase {
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[i])) {
                    exch(a, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.test(new Integer[]{8, 4, 5, 2, 9, 7, 1, 3, 6});
    }
}
