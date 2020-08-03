package com.algorithm.sort;

public class SortBase {
    public void sort(Comparable[] a) {

    }

    //v是否小于w
    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    //交换a[i]和a[j]
    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public void test(Comparable[] a) {
        sort(a);
        boolean isSorted = isSorted(a);
        System.out.println("isSorted:" + isSorted);
        if (isSorted) {
            show(a);
        }
    }
}
