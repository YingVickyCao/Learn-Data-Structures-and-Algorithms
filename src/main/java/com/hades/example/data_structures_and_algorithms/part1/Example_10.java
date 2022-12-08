package com.hades.example.data_structures_and_algorithms.part1;

// 空间复杂度分析 - o(n)
public class Example_10 {
    public static void main(String[] args) {
        Example_10 example_10 = new Example_10();
        example_10.print(5);
    }

    /**
     * a[i=0]=0
     * a[i=1]=1
     * a[i=2]=4
     * a[i=3]=9
     * a[i=4]=16
     * <p>
     * a[j=4]=16
     * a[j=3]=9
     * a[j=2]=4
     * a[j=1]=1
     * a[j=0]=0
     */
    private void print(int n) {
        int i = 0; // 申请了一个空间存储i，但是它是常量阶的，跟数规模n没有关系。所以，可以忽略它

        // start
        int[] a = new int[n]; // 申请了n 个 空间来存储int类型数组
        // end

        for (; i < n; ++i) {
            a[i] = i * i;
            System.out.println("a[i=" + i + "]=" + a[i]);
        }

        System.out.println();

        int j = n - 1; // // 申请了一个空间存储j，但是它是常量阶的，跟数规模n没有关系。所以，可以忽略它
        for (; j >= 0; --j) {
            System.out.println("a[j=" + j + "]=" + a[j]);
        }
    }
    /**
     * 整段代码的空间复杂度 为 O(n)
     */
}
