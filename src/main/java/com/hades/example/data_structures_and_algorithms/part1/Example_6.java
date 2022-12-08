package com.hades.example.data_structures_and_algorithms.part1;

// 时间复杂度 - O(logn) 对数阶时间复杂
public class Example_6 {

    public static void main(String[] args) {
        Example_6 example_6 = new Example_6();
        int result = example_6.cal(5);
        System.out.println(result); // 2
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
        int result = 0;

        // Tn = O(log 2 n)
        // start
        while (i <= n) {
            i = i * 2;
            result = count_of_unit_time;
            System.out.println("i=" + i + ",count of unit_time = " + (count_of_unit_time++));
        }
        // end
        return result;
    }

    /**
     * <pre>
     * 2^0   2^1   2^2   2^3   2^x = n
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


    private int cal2(int n) {
        int i = 1;
        int count_of_unit_time = 0; // 只作为统计，不计入unit_time
        int result = 0;

        // Tn = O(log 3 n)
        // start
        while (i <= n) {
            i = i * 3;
            result = count_of_unit_time;
            System.out.println("i=" + i + ",count of unit_time = " + (count_of_unit_time++));
        }
        // end
        return i;
    }

    /**
     * 不管是 O(log 2 n) 还是 O(log 3 n)，把所有对数阶的时间复杂度都记做 O(log n)。
     * 为什么？
     * log 3 n = log(3^2) * log(2 n)
     * => O(log 3 n) = O (C * log(2 n)),其中C 是 log(3^2)，是一个常量。
     *
     * 基于之前的理论： 当采用大O标记复杂度时，可以忽略系数，即O(C(fn)) = O (f(n))
     * 那么，O(log 3 n)就等于 O (log(2 n)。
     * 因此，在对数阶时间复杂度的表示方法里，忽略了对数的"底"，统一表示为 log(n)。
     */
}
