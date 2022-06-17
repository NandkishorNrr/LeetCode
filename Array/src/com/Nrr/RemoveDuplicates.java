package com.Nrr;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
//public int[] removeDuplicates(int[] nums) {
    int arr[] = new int[nums.length ];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1])
                arr[count++] = nums[i];
        }
    arr[count++] = nums[nums.length - 1];
        return count;
//        return arr;
    }
}
