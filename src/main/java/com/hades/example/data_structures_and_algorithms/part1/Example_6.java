package com.hades.example.data_structures_and_algorithms.part1;

// 时间复杂度 - O(logn) 对数阶时间复杂
public class Example_6 {

    public static void main(String[] args) {
        Example_6 example_6 = new Example_6();
        int result = example_6.cal(5);
        System.out.println(result);
    }

    /**
     * <pre>
     * i=2,count of unit_time = 0
     * i=4,count of unit_time = 1
     * i=8,count of unit_time = 2
     *
     *  </pre>
     */

    private int cal(int n) {
        int i = 1;
        int count_of_unit_time = 0; // 只作为统计，不计入unit_time

        // start
        while (i <= n) {
            i = i * 2;
            System.out.println("i=" + i + ",count of unit_time = " + (count_of_unit_time++));
        }
        // end
        return i;
    }

    /**
     * <pre>
     2^0   2^1   2^2   2^3   2^x = n
     * => 2^x = n
     *
     *  这段代码的含义：2^x 小于等于 5， 求X
     *  => 2^2 小于等于 5
     *  => x = 2
     *
     *  这段代码的实际作用：求解 2^X = n，那么 x 等于 log 2 n
     *
     *  这段代码的时间复杂度是Tn = O(log 2 n)
     *  </pre>
     */
}
