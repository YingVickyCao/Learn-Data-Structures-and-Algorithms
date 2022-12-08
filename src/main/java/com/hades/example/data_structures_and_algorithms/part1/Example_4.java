package com.hades.example.data_structures_and_algorithms.part1;

/**
 * 时间复杂度分析 - 3. 乘法法则：嵌套代码的复杂度等于嵌套内外代码复杂度的乘积
 */
public class Example_4 {
    public static void main(String[] args) {
        Example_4 example_4 = new Example_4();
        example_4.cal(5);
    }

    int cal(int n) {
        int result = 0;
        int i = 1;
        // T1(n) = O(n)
        // start
        for (; i < n; ++i) { //  n 个 unit_time
            result = result + f(i);
        }
        // end
        return result;
    }

    int f(int n) {
        int sum = 0;
        int i = 1;
        // T2(n) = O(n)
        // start
        for (; i < n; ++i) { //  n 个 unit_time
            sum = sum + i;
        }
        // end
        return sum;
    }
}

/**
 * 把乘法法则看成是嵌套循环
 * 整个cal的时间复杂度：
 * T1(n) = O(n)
 * T2(n) = O(n)
 * Tn = T1(n) *T2(n) = O(n * n)  = O(n2)
 */
