package com.hades.example.data_structures_and_algorithms.part1;

/**
 * 时间复杂度分析 - 2. 加法法则：总复杂度等于量级最大的那段代码的复杂度
 */
public class Example_3 {

    public static void main(String[] args) {
        Example_3 example_3 = new Example_3();
        example_3.cal(200);
    }

    private int cal(int n) {
        // 求sum_1时，是常量级的执行时间。跟n无关。
        int sum_1 = 0;
        int i = 1;
        // start
        for (; i < 100; ++i) { // 100
            sum_1 = sum_1 + i;
        }
        // end


        // 求sum_2：O(n)
        int sum_2 = 0;
        int j = 1;
        // start
        for (; j < n; ++i) {
            sum_2 = sum_2 + j;
        }
        // end


        // 求sum_3：O(n^2)
        int sum_3 = 0;
        int k = 1;
        int l = 1;
        // start
        for (; k <= n; ++k) {
            j = 1;
            for (; l <= n; ++l) {
                sum_3 = sum_3 + k * l;
            }
        }
        // end
        return 0;
    }
}

/**
 * <pre>
 * 这段代码，分为3个部分，求sum_1、求sum_2、求sum_3。
 *
 * 求sum_1：循环执行了100次。所以，它是1个常量的执行时间，跟n的规模无关。只要一个已知的数，即使是循环1000次，那么也跟n无关，是常量级的执行时间。
 * 当 n 无限大的时候，就可以忽略。尽管对代码的执行时间会有很大影响，但是根据时间复杂度的概念来说，它表示的是一个算法执行效率与数据规模增长的变化趋势，所以不管常量的执行时间多大，我们都可以忽略掉。因为它本身对增长趋势并没有影响。
 *
 * 求sum_2：O(n)
 *
 * 求sum_3：O(n^2)
 *
 * 那么，整段代码的时间复杂度是O(n^2)。
 *
 * T1(n) = O(f(n))
 * T2(n) = O(f(n^2))，
 * Tn = T1(n) + T2(n) =  max(O(f(n)),O(f(n^2))) = O(max(f(n),f(n^2)) = O(n^2)
 *
 * 总的时间复杂度就等于量级最大的那段代码的时间复杂度。
 * 规律抽象成公式 : 如果 T1(n)=O(f(n))，T2(n)=O(g(n))；那么 T(n)=T1(n)+T2(n)=max(O(f(n)), O(g(n))) =O(max(f(n), g(n)))
 * </pre>
 */
