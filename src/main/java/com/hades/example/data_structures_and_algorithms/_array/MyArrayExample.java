package com.hades.example.data_structures_and_algorithms._array;

public class MyArrayExample {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(); // len is 5
        {
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

        {
            int[] nums = new int[]{15, 5, 30, 90, 50};
            myArray.selectionSort(nums, nums.length);
            System.out.println(myArray);
        }

        {
            int[] nums = new int[]{15, 5, 30, 90, 50};
            myArray.sortByBubbling(nums, nums.length);
            System.out.println(myArray);
        }

        {
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
    }
}
