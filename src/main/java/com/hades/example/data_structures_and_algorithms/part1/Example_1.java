package com.hades.example.data_structures_and_algorithms.part1;

/**
 * 时间复杂度分析 - 大 O 复杂度表示法
 */
public class Example_1 {
    public static void main(String[] args) {
        Example_1 example_1 = new Example_1();
        int result = example_1.cal(5);
        System.out.println(result);
    }


    /**
     * i=1
     * i=2
     * i=3
     * i=4
     * i=5
     */
    private int cal(int n) {
        // START
        int sum = 1; // 1 unit_time
        int i = 1;   // 1 unit_time

        for (; i <= n; i++) { // n 个 unit_time++
            sum = sum + i;    // n 个 unit_time++
            System.out.println("i=" + i); // 只作为统计，不计入unit_time
        }
        // END
        return sum;
    }

    /**
     * 从CPU的角度看，这段代码的每一行都执行着类似的操作：读数据-运算-写数据
     * 虽然每行代码对应的CPU执行的个数、执行时间都不一样。但是因为这里做的是粗略估计，所以，假设每行代码的时间是一样，为unit_time。 那么，这段代码的总执行时间是多少？
     *
     *总执行时间
     * = (2 + 2n)
     * = 2n + 2
     *
     *
     * 总执行时间 : (2n + 2) * unit_time
     *
     * 结论：所有代码的执行时间 T(n) 与每行代码的执行次数f(n)成正比。
     */
}
