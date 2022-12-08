package com.hades.example.data_structures_and_algorithms;

/**
 * 时间复杂度分析 - 大 O 复杂度表示法
 */
public class Example_2 {
    public static void main(String[] args) {
        Example_2 example_2 = new Example_2();
        example_2.cal(3);
    }

    /**
     * outer for : count1 =1,i=1
     * inner for : count2 =1,j=1
     * inner for : count2 =2,j=2
     * inner for : count2 =3,j=3
     *
     * outer for : count1 =2,i=2
     * inner for : count2 =4,j=1
     * inner for : count2 =5,j=2
     * inner for : count2 =6,j=3
     *
     * outer for : count1 =3,i=3
     * inner for : count2 =7,j=1
     * inner for : count2 =8,j=2
     * inner for : count2 =9,j=3
     */
    private int cal(int n) {
        int count1 = 0; // 只作为统计，不计入 unit_time
        int count2 = 0; // 只作为统计，不计入 unit_time

        int sum = 0;    // 1 unit_time
        int i = 1;      // 1 unit_time
        int j = 1;      // 1 unit_time
        for (; i <= n; ++i) { // n 个  unit_time
            j = 1; // n 个 unit_time

            System.out.println("outer for : count1 =" + (++count1) + "," + "i=" + i); // 只作为统计，不计入unit_time

            for (; j <= n; ++j) { // n*n 个  unit_time
                sum = sum + i * j; // n*n 个  unit_time
                System.out.println("inner for : count2 =" + (++count2) + "," + "j=" + j); // 只作为统计，不计入unit_time
            }
        }
        return sum;
    }
}
/**
 * 总执行时间
 * = 3 + 2n + m(value is n) + 2n * n
 * = (2n^2 + 2n + 3)* unit_time
 *
 * 结论：整段代码总的执行时间 T(n) = (2n^2+2n+3)*unit_time
 *
 * 所有代码的执行时间 T(n) 与每行代码的执行次数 f(n) 成正比。
 */
