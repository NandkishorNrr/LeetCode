package com.Nrr;

import java.util.Arrays;

//Q.
public class Array {
    public boolean arrayMed;
    // Prblm - 1: Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (target == nums[i] + nums[j]){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return null;
    }
    //Extra - 1 : sorting, merging and remove duplicate elements from array.
    public double arrayManupulate(int[] nums1, int[] nums2){
        double med;
        int medLenght = nums1.length + nums2.length;
        int[] medArray = new int[medLenght];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            medArray[count++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            medArray[count++] = nums2[i];
        }
        medArray = removeDuplicateElement(medArray);
        medLenght = medArray.length;
        if (medLenght % 2 != 0)
            med  = medArray[medLenght / 2];
        else
            med = (double) ((double)(medArray[medLenght / 2] + (double)medArray[medLenght / 2 - 1]) / 2);
        return med;
    }
    public int[] removeDuplicateElement(int[] array){
        int j = 0;
        Arrays.sort(array);
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
                if (array[i] != array[i + 1])
                    tempArray[j++] = array[i];
        }
        tempArray[j] = array[array.length-1];
        array = new int[j + 1];
        for (int i = 0; i < j + 1; i++) {
            array[i] = tempArray[i];
        }
        return array;
    }
    //Prblm - 2: Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med;
        int medLenght = nums1.length + nums2.length;
        int[] medArray = new int[medLenght];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            medArray[count++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            medArray[count++] = nums2[i];
        }
        Arrays.sort(medArray);
        medLenght = medArray.length;
        if (medLenght % 2 != 0)
            med  = medArray[medLenght / 2];
        else
            med = (double) ((double)(medArray[medLenght / 2] + (double)medArray[medLenght / 2 - 1]) / 2);
        System.out.println(Arrays.toString(medArray));
        return med;
    }
}