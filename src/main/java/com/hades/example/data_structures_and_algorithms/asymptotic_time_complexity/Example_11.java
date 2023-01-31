package com.hades.example.data_structures_and_algorithms.asymptotic_time_complexity;

/**
 * 时间复杂度分析：最好情况时间复杂度：O(1)、最坏情况时间复杂度:O(n)，平均情况时间复杂度:O(n)
 */
public class Example_11 {
    public static void main(String[] args) {
        Example_11 example = new Example_11();

        int[] array = new int[]{1, 9, 3, 7, 2, 0, 8}; // length is 7
        // 改进前
        {
            int num_to_find = 1;
            int position = example.find(array, num_to_find);
            System.out.println("find " + num_to_find + " at position " + position);
        }
        System.out.println("------------------------------");
        {
            int num_to_find = 8;
            int position = example.find(array, num_to_find);
            System.out.println("find " + num_to_find + " at position " + position);
        }
        System.out.println("------------------------------");
        // 改进后：
        {
            int num_to_find = 1;
            int position = example.find2(array, array.length, num_to_find);
            System.out.println("find " + num_to_find + " at position " + position);
        }
        System.out.println("------------------------------");
        {
            int num_to_find = 8;
            int position = example.find2(array, array.length, num_to_find);
            System.out.println("find " + num_to_find + " at position " + position);
        }

    }

    // 改进前：时间复杂度：O(n)
    int find(int[] array, int x) { // length 数组array的长度
        int count = 0;
        // start
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == x) {
                System.out.println("find " + x);
                position = i;
            }
        }
        // end

        System.out.println("count is " + count);
        return position;
    }

    // 改进后：最好情况时间复杂度：O(1)、最坏情况时间复杂度:O(n)
    int find2(int[] array, int length, int x) { // length 数组array的长度
        int count = 0;
        // start
        int position = -1;
        for (int i = 0; i < length; i++) {
            count++;
            if (array[i] == x) {
                System.out.println("find " + x);
                position = i;
                // 改进：在数组中查到一个数据后，提前结束循环
                break;
            }
        }
        // end

        System.out.println("count is " + count);
        return position;
    }
}


/**
 * 要查找的变量 x 可能出现在数组的任意位置
 * 改进前：
 * 假如x在第1个/x在最后一个/数组中不存在 x，时间复杂度始终是 O(n)
 *
 * 改进后： 不同的情况，这段代码的时间复杂度是不一样的。
 * 假如x在第1个，时间复杂度：O(1)
 * 假如x在最后一个，时间复杂度：O(n)
 * 假如数组中不存在 x，时间复杂度：O(n)
 *
 * 那么，还用时间复杂度始终是 O(n)表示就不合适了。
 *
 * 为了表示代码在不同情况下的不同时间复杂度，引入三个概念：最好情况时间复杂度、最坏情况时间复杂度、平均情况时间复杂度。
 * 即：改进后：最好情况时间复杂度：O(1)、最坏情况时间复杂度:O(n)，平均情况时间复杂度:O(n)
 */
