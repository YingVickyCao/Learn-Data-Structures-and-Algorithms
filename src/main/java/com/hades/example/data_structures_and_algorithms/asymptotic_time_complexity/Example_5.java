package com.hades.example.data_structures_and_algorithms.asymptotic_time_complexity;

/**
 * 时间复杂度 - O(1)
 */
public class Example_5 {
    public static void main(String[] args) {

        Example_5 example_5 = new Example_5();
        System.out.println(example_5.sum());
        System.out.println(example_5.sum(8, 6));
    }

    // 这段代码的时间复杂度是 O(1), 代码共有3 个 unit_time
    private int sum() {
        // start
        int i = 8;          // 1 unit_time
        int j = 6;          // 1 unit_time
        int sum = i + j;    // 1 unit_time
        // end
        return sum;
    }

    // 这段代码的时间复杂度是 O(1), 代码共有1 个 unit_time
    private int sum(int i, int j) {
        // start
        int sum = i + j;    // 1 unit_time
        // end
        return sum;
    }
}

/**
 * O(1) 只是 常量级时间复杂度的一种表示方法。并不指只执行了1行代码。
 * 只要代码的执行时间不随着n的增大而增大，那么这段代码的时间复杂度，都记做 O(1)。
 *
 * 一般情况下，只要算法中不存在循环语句、递归语句，即使有成千上万条代码，那么其时间复杂度也是O(1)。
 *
 */