package com.hades.example.data_structures_and_algorithms.asymptotic_time_complexity;

/**
 * 时间复杂度 - O(m + n)
 */
public class Example_8 {
    public static void main(String[] args) {
        Example_8 example_8 = new Example_8();
        example_8.cal(3, 5);
    }

    /**
     * <pre>
     * m count of unit_time = 1
     * m count of unit_time = 2
     *
     * n count of unit_time = 1
     * n count of unit_time = 2
     * n count of unit_time = 3
     * n count of unit_time = 4
     * </pre>
     */
    private int cal(int m, int n) {
        int sum_1 = 0;
        int i = 1;
        int count_of_unit_time = 0; // // 只作为统计，不计入unit_time
        // O(m)
        // start
        for (; i < m; i++) {
            sum_1 = sum_1 + i;
            count_of_unit_time++;
            System.out.println("m count of unit_time = " + count_of_unit_time);
        }
        // end

        int sum_2 = 0;
        int j = 1;
        int count2_of_unit_time = 0; // // 只作为统计，不计入unit_time
        // start
        // O(n)
        for (; j < n; j++) {
            sum_2 = sum_2 + j;
            count2_of_unit_time++;
            System.out.println("n count of unit_time = " + count2_of_unit_time);
        }
        // end
        return sum_1 + sum_2;
    }
}

/**
 * m 和 n 表示两个数据规模。
 * 因为无法评估m和n谁的量级更大，所以在表示时间复杂度时，不能简单地利用加法法则，省略掉其中一个。所以，上面的时间复杂度为 O(m + n)。
 * <p>
 * 针对这种情况，原来的加法法则就不正确了。把加法规则改为 ： T1(m) + T2(n) = O(f(m) + g(n))
 */