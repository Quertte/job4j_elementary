package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rs1 = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int i = 0; i < rs1.length; i++) {
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
                    rs1[i] = left[l++];
                } else {
                    rs1[i] = right[r++];
                }
            } else if (l < left.length) {
                rs1[i] = left[l++];
            } else if (r < right.length) {
                rs1[i] = right[r++];
            }
        }
        return rs1;
    }
}
