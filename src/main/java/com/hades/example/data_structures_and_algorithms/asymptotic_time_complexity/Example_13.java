package com.hades.example.data_structures_and_algorithms.asymptotic_time_complexity;

public class Example_13 {
    // array，it's length is len，index is i
    int len = 10;
    int array[] = new int[len];
    int i = 0;

    public static void main(String[] args) {
        Example_13 example_13 = new Example_13();
        example_13.add(1);
        example_13.add(2);
        example_13.add(3);
        example_13.add(4);
        example_13.add(5);
        example_13.add(6);
        example_13.add(7);
        example_13.add(8);
        example_13.add(9);
        example_13.add(10);
        example_13.add(11);
        example_13.add(12);
    }

    void add(int element) {
        if (i >= len){ // 数组空间不够了
            // 重新申请一个2倍大小的数组空间
            int[] new_array = new int[len * 2];

            // copy data，from  array to new_array
            for (int j = 0; j < len; j++){
                new_array[j] = array[j];
            }

            array = new_array;
            len = 2 * len;
        }

        array[i] = element;
        i++;
    }
}
/**
 * example_13.add(1);   index = 0, not invoked for , invoke array[0] = 1, then index = 1
 * example_13.add(2);   index = 1, not invoked for , invoke array[1] = 2, then index = 2
 * ...
 * example_13.add(9);   index = 8,  not invoked for , invoke array[8] = 9, then index = 9
 * example_13.add(10);  index = 9,  not for invoked,  invoke array[10] = 10, then index = 10  => index = n-1
 * example_13.add(11);  index = 10, invoked for,      invoke array[11] = 11, then index = 11  => index = n 最坏情况
 * example_13.add(12);  index = 11, not invoked for, invoke array[12] = 12, then index = 12
 *
 *
 * 计算平均时间复杂度 ？
 * 0， 1， 2， 3，..， n-1            |  n
 * 1,  1,  1,  1, .., 1 （n种情况）   |  n（1种情况）, 一共 n+1种情况。
 * = 2n/(n+2)
 * => 平均时间复杂度：0(1)
 *
 *  计算均摊时间复杂度 ？
 *  把index = n，摊到 index= 0~n-1,每个index，摊得 1 。
 *      0， 1， 2， 3，..， n-1  |  n
 *      1,  1,  1,  1, ..,  1 （n种情况）   |  n（1种情况）, 一共 n+1种情况。
 * =>  +1，+1，+2，+1，..., +1 （n种情况）
 * =>   2,  2,  2,  2, .., 2 （n种情况）
 * 得出，均摊时间复杂度为2 => O(1)
 *
 * 最好情况时间复杂度：O(1)、最坏情况时间复杂度：O(n)、平均时间复杂度：0(1),均摊时间复杂度：O(1)
 */
