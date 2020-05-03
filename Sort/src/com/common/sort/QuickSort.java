package com.common.sort;

import java.util.Arrays;

/**
 * @author: songlin
 * @date: 2020-05-03 16:39
 * @desc:
 */
public class QuickSort {

    public static void main(String[] args) {
        int [] a = {1,6,8,7,3,5,16,4,8,36,13,44};
        QKSourt(a,0,a.length-1);
        for (int i:a) {
            System.out.print(i + " ");
        }
    }

    private static void QKSourt(int[] a, int start, int end) {
        if (a.length < 0){
            return ;
        }
        if (start >= end){
            return ;
        }
        int left = start;
        int right = end;
        int temp = a[left];
        while (left < right){
            while (left < right && a[right] > temp){
                right -- ;
            }
            a[left] = a[right];
            while (left < right && a[left] < temp){
                left ++ ;
            }
            a[right] = a[left];
        }
        a[left] = temp;
        System.out.println(Arrays.toString(a));
        QKSourt(a, start, left -1);
        QKSourt(a,left+1,end);
    }
}
