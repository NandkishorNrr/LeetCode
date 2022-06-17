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
                if (target == nums[i] + nums[j]) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return null;
    }

    //Extra - 1 : sorting, merging and remove duplicate elements from array.
    public double arrayManupulate(int[] nums1, int[] nums2) {
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
            med = medArray[medLenght / 2];
        else
            med = (double) ((double) (medArray[medLenght / 2] + (double) medArray[medLenght / 2 - 1]) / 2);
        return med;
    }

    public int[] removeDuplicateElement(int[] array) {
        int j = 0;
        Arrays.sort(array);
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1])
                tempArray[j++] = array[i];
        }
        tempArray[j] = array[array.length - 1];
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
            med = medArray[medLenght / 2];
        else
            med = (double) ((double) (medArray[medLenght / 2] + (double) medArray[medLenght / 2 - 1]) / 2);
        System.out.println(Arrays.toString(medArray));
        return med;
    }
/*//   Prblm - 3:
    You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    Find two lines that together with the x-axis form a container, such that the container contains the most water.
    Return the maximum amount of water a container can store.*/
/* public int maxArea(int[] height) {
        int area;

        return area = 0;
    }*/
    // Prblm - 4: 2. Add Two Numbers
    /*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

   /* public class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) {
        this.val = val;
    }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
  }
    class Solution {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node addedNode;
        Node current = l1;
        int num1;
        int num2;
        int sum;
        while (current != null){

        }
        return addedNode;
    }
}*/
   public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
       var list = new LinkedList();
       var current1 = l1.first;
       var current2 = l2.first;
       int[] array1 = new int[l1.size];
       int[] array2 = new int[l2.size];
       int num1 = 0;
       int num2 = 0;
       int sum = 0;
       for (int i = 0; i < l1.size; i++) {
           array1[i] = current1.value;
           current1 = current1.next;
       }
       for (int i = 0; i < l2.size; i++) {
           array2[i] = current2.value;
           current2 = current2.next;
       }
       for (int i = array1.length-1; i >= 0 ; i--) {
           num1 = num1*10 + array1[i];
       }
       for (int i = array2.length-1; i >= 0 ; i--) {
           num2 = num2*10 + array2[i];
       }
       sum = num1 + num2;
       while (sum != 0){
           list.addLast(sum % 10);
           sum = sum / 10;
       }
       return list;
   }
    public static class LinkedList {
        public class Node {
            private int value;
            private Node next;
            public Node(int value) {
                this.value = value;
            }
        }
        private Node first;
        private Node last;
        private int size;
        public void addLast(int item){
//        Node node = new Node();
            var node = new Node(item); // var to compiler detect automatically
            if (isEmpty())
                first = last = node;
            else {
                last.next = node;
                last = node;
            }
            size++;
        }
        private boolean isEmpty(){
            return first == null;
        }
    }
}
