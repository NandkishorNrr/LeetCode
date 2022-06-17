package com.Nrr;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var arrays = new Array();
/*
//Prblm - 1 : Two sum
        var array = new Array();
        System.out.println(Arrays.toString(arrays.twoSum(array, 6)));*/
/*
//Extra Prblm - 1 : sorting, merging and remove duplicate elements from array.
        int[] array1 = {1, 5, 4, 12, 1, 3, 10};
        int[] array2 = {8, 2, 6 ,9 ,7 ,3,11};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(arrays.arrayManupulate(array1, array2));*/
/*//Prblm - 2 : Meian of two sorted array
        int[] array1 = {1, 5, 4, 12, 1, 3, 10};
        int[] array2 = {8, 2, 6 ,9 ,7 ,3,11};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(arrays.findMedianSortedArrays(array1, array2));*/
//        Array array = new Array();

       /* ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3, l1);
        ListNode l3 = new ListNode(4,l2);
//        Array.LinkedList l2 = new Array.LinkedList();
////        Array.LinkedList returnList = new Array.LinkedList();
//        l1.val(2);
//        l1.addLast(7);
//        l1.addLast(2);
//        l2.addLast(1);
//        l2.addLast(6);
//        l2.addLast(5);
//        returnList = array.addTwoNumbers(l1, l2);
        Solution sol = new Solution();
        l3.print();*/
        RemoveDuplicates removeDupli = new RemoveDuplicates();
//        int arr[] = {1, 1, 2, 4, 5, 5, 5, 6};
        int arr[] = {1, 1, 2};
//        System.out.println(Arrays.toString(removeDupli.removeDuplicates(arr)));
        System.out.println(removeDupli.removeDuplicates(arr));
    }
}
