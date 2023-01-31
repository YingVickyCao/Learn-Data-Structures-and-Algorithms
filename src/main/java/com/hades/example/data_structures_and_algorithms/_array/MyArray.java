package com.hades.example.data_structures_and_algorithms._array;

import java.util.Arrays;

/**
 * 实现数组
 */
public class MyArray {
    private int[] nums;

    public MyArray() {
    }

    public MyArray(int[] nums) {
        this.nums = nums;
        System.out.println(Arrays.stream(nums).toArray());
    }

    /**
     * 没有排序时的查找
     * 时间复杂度是：O（n）
     * 最好情况时间复杂度：O（1）
     * 最坏情况时间复杂度：O（n）
     * 平均情况时间复杂度：O（n）
     */
    int find(int nums[], int n, int num) {
        if (nums == null || n == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            System.out.println("find,count is " + count);
            if (num == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    // 二分查找法
    // 前提：已按从小到大排序
    // TODO：时间复杂度也是 O(logn)
    // 最坏情况时间复杂度：O(1)
    // 最好情况时间复杂度：O(1)
    public int binarySearch(int[] nums, int n, int key) {
        if (null == nums || n == 0) {
            return -1;
        }
        int min = 0;
        int max = n - 1;
        int middle = n / 2;
        int index = -1;

        while (nums[middle] != key) {
            if (key < nums[min] || key > nums[max]) {
                break;
            }

            // optional
//            if (nums[min] == key) {
//                return min;
//            }
//            if (nums[max] == key) {
//                return max;
//            }


            if (nums[middle] > key) {
                max = middle - 1;
            } else if (nums[middle] < key) {
                min = middle + 1;
            }
            middle = (min + max) / 2;
        }
        if (nums[middle] == key) {
            index = middle;
        }
        return index;
    }

    public void selectionSort(int[] nums, int n) {
        if (null == nums || n == 0) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {        // i=[0,n-1)
//            System.out.print("i = " + i + ":");
            for (int j = i + 1; j < n; j++) { // j = [i+1, n)
//                System.out.print("j = " + j + ", ");
                if (nums[i] > nums[j]) {        // i 与 j 比较
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
//            System.out.println();
        }
    }

    /**
     * 冒泡排序:从小到大
     * 时间复杂度：O(n2)
     * 最好情况时间复杂度：O(n2)
     * 最坏情况时间复杂度：O(n2)
     * 平均情况时间复杂度：O(n);
     */
    public void sortByBubbling(int[] nums, int n) {
        if (null == nums || n == 0) {
            return;
        }
        for (int i = 0; i < (n - 1); i++) {         // 外层循环：i=[0,n-1)
//            System.out.print("i = " + i + ":");
            for (int j = 0; j < (n - 1 - i); j++) { // 内层循环：j=[0,n-1-i)
//                System.out.print("j = " + j + ", ");
                if (nums[j] > nums[j + 1]) {        // j 与 j + 1 比较
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
//            System.out.println();
        }
    }


    @Override
    public String toString() {
        return "MyArray{" + "nums=" + Arrays.toString(nums) + '}';
    }
}
