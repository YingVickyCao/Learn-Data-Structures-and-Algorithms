package com.hades.example.data_structures_and_algorithms._array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void find() {
        MyArray myArray = new MyArray();
        int[] nums = new int[]{15, 5, 30, 90, 50};
        {
            int index = myArray.find(nums, nums.length, 40);
            System.out.println(index);
        }

        {
            int index = myArray.find(nums, nums.length, 15);
            System.out.println(index);
        }
    }

    @Test
    void binarySearch() {
        MyArray myArray = new MyArray();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        {
            int index = myArray.binarySearch(nums, nums.length, -1); // -1
            System.out.println(index);
        }

        {
            int index = myArray.binarySearch(nums, nums.length, 6); // -1
            System.out.println(index);
        }

        {
            int index = myArray.binarySearch(nums, nums.length, 1); // 0
            System.out.println(index);
        }

        {
            int index = myArray.binarySearch(nums, nums.length, 5); // 4
            System.out.println(index);
        }
        {
            int index = myArray.binarySearch(nums, nums.length, 2); // 1
            System.out.println(index);
        }
        {
            int index = myArray.binarySearch(nums, nums.length, 3); // 2
            System.out.println(index);
        }
    }

    @Test
    void selectionSort() {
        MyArray myArray = new MyArray();

        int[] nums = new int[]{15, 5, 30, 90, 50};
        myArray.selectionSort(nums, nums.length);
        System.out.println(myArray);
    }

    @Test
    void sortByBubbling() {
        MyArray myArray = new MyArray();

        int[] nums = new int[]{15, 5, 30, 90, 50};
        myArray.sortByBubbling(nums, nums.length);
        System.out.println(myArray);
    }
}