package com.hades.example.data_structures_and_algorithms.part1;

/**
 * 时间复杂度 - O(m * n)
 */
public class Example_9 {

    public static void main(String[] args) {
        Example_9 example_9 = new Example_9();
        example_9.cal(3, 5);
    }

    /**
     * <pre>
     * m count of unit_time = 1
     * n count of unit_time = 1
     * n count of unit_time = 2
     * n count of unit_time = 3
     * n count of unit_time = 4
     * n count of unit_time = 5
     *
     * m count of unit_time = 2
     * n count of unit_time = 6
     * n count of unit_time = 7
     * n count of unit_time = 8
     * n count of unit_time = 9
     * n count of unit_time = 10
     *
     * m count of unit_time = 3
     * n count of unit_time = 11
     * n count of unit_time = 12
     * n count of unit_time = 13
     * n count of unit_time = 14
     * n count of unit_time = 15
     * </pre>
     */
    private int cal(int m, int n) {
        int sum_1 = 0;
        int i = 1;
        int count_of_unit_time = 0; // // 只作为统计，不计入unit_time

        int count2_of_unit_time = 0; // // 只作为统计，不计入unit_time

        // O(m)
        // start
        for (; i <= m; i++) {
            sum_1 = sum_1 + i;

            count_of_unit_time++;
            System.out.println("m count of unit_time = " + count_of_unit_time);
            System.out.println();
            // end

            int j = 1;
            // O(n)
            // start
            for (; j <= n; j++) {
                sum_1 = sum_1 + j;

                count2_of_unit_time++;
                System.out.println("n count of unit_time = " + count2_of_unit_time);
            }
            // end
        }
        return sum_1;
    }

    /**
     * m 和 n 表示两个数据规模。
     * 因为无法评估m和n谁的量级更大，所以在表示时间复杂度时，不能简单地省略掉其中一个。所以，上面的时间复杂度为 O(m * n)。
     * 针对这种情况，原来的乘法法则继续有效。T1(m) + T2(n) = O(f(m) * g(n))
     */
}
