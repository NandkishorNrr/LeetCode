package com.Nrr;

import java.util.Arrays;

public class Solution {
    ListNode sortedList = new ListNode();
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int[] listArr = new int[50];
        int count = 0;
        while (list1 != null || list2 != null){
            while (list1 != null){
                listArr[count++] = list1.val;
                list1 = list1.next;
            }
            while (list2 != null){
                listArr[count++] = list2.val;
                list2 = list2.next;
            }
        }
        Arrays.copyOfRange(listArr, 0 , count);
        Arrays.sort(listArr);
        count = 0;
        while (count != listArr.length){
            sortedList.val = listArr[count++];
        }
        return sortedList;
    }
}
