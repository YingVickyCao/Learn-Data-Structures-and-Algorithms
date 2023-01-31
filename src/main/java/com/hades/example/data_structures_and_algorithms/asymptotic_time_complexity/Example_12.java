package com.hades.example.data_structures_and_algorithms.asymptotic_time_complexity;

//  均摊时间复杂度
public class Example_12 {
    int length_of_array = 10;
    int[] array = new int[length_of_array];
    int count = 0;

    public static void main(String[] args) {
        Example_12 example_12 = new Example_12();

        example_12.insert(1);
        example_12.insert(2);
        example_12.insert(3);
        example_12.insert(4);
        example_12.insert(5);
        example_12.insert(6);
        example_12.insert(7);
        example_12.insert(8);
        example_12.insert(9);
        example_12.insert(10);
        example_12.count = example_12.length_of_array;
        example_12.insert(1);
    }

    void insert(int val) {
        if (count == array.length) {
            int sum = 0;
            for (int i = 0; i < array.length; ++i) {
                sum = sum + array[i];
            }
            array[0] = sum;
            count = 0;
        }
        array[count] = val;
        ++count;
    }
}

/*
 这个例子只是为了方便讲解想出来的，实际上没人会这么写。

 这段代码实现了往一个数组中插入数据。count == array.length时，把sum放入第一个位置，并reset count指向第一个位置。

val = 1:  array[0] = 1; count = 1, 不进入for循环，时间复杂度为O(1)  => index = 0

val = 2:  array[1] = 2; count = 2, 不进入for循环，时间复杂度为O(1)  => index = 1
 ...

val = 9: array[9] = 10; count = 10,不进入for循环，时间复杂度为O(1) => index = n-1
val = 10:array[0] = 10; count = 0, 进入for循环，执行10次，时间复杂度为 O(n) index = 0 ~ n-1

因此，最好时间复杂度为O(1)、最坏情况时间复杂度为O(n)、平均时间复杂度：O(1)、均摊时间复杂度：O(1)

 */