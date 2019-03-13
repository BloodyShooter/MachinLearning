package org.gvozdetscky;

import org.junit.Test;

import java.util.Arrays;

public class sotedTest {

    @Test
    public void mergeSort() {

    }

    private static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) return arr;
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    private static int[] merge(int[] arr_left, int[] arr_right) {
        int len_arr_left = arr_left.length, len_arr_right = arr_right.length;
        int a = 0, b = 0, len = len_arr_left + len_arr_right; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_arr_right && a < len_arr_left) {
                if (arr_left[a] > arr_right[b]) result[i] = arr_right[b++];
                else result[i] = arr_left[a++];
            } else if (b < len_arr_right) {
                result[i] = arr_right[b++];
            } else {
                result[i] = arr_left[a++];
            }
        }
        return result;
    }
}
