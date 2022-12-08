package com.hades.example.data_structures_and_algorithms.part1;

// 时间复杂度 - O(nlogn) 线性对数阶时间复杂
public class Example_7 {

    public static void main(String[] args) {
        int[] arrays = new int[]{5, 10};

        Example_7 example_7 = new Example_7();
        example_7.calArray(arrays);
    }

    private void calArray(int[] arrays) {
        int i = 0;
        int result = 0;

        int n = arrays.length;

        // T1(n) = O(n)
        // start
        for (; i < n; i++) {
            result = cal(arrays[i]);

            System.out.println("array[" + i + "]=" + result);   // 只作为统计，不计入unit_time
            System.out.println();                               // 只作为统计，不计入unit_time
        }
        // end
    }

    private int cal(int n) {
        int i = 1;
        int count_of_unit_time = 0; // 只作为统计，不计入unit_time
        int result = 0;

        // T2(n) = O(log 2 n)
        // start
        while (i <= n) {
            i = i * 2;
            result = count_of_unit_time;
            System.out.println("i=" + i + ",count of unit_time = " + (count_of_unit_time++)); // 只作为统计，不计入unit_time
        }
        // end
        return result;
    }

    /**
     * T1(n) = O(n)
     * T2(n) = O(log 2 n)
     * 根据乘法原则，那么calArray 整个代码的时间复杂度为 ：
     * =>T(n) = T1(n) * T2(n) = O(n) * O(log 2 n) = O(n * log 2 n)
     * => T(n) = O(n * log n)
     */
}