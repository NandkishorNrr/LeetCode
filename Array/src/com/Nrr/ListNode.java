package com.Nrr;

import java.util.Arrays;

public class ListNode {
     int val;
     ListNode next ;
     int[] arr = new int[5];
     int count = 0;
     ListNode() {}
     ListNode(int val) { this.val = val;
          if (arr.length == count)
               arr = new int[count*2];
          arr[count++] = val;
     }
     ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
          if (arr.length == count)
               arr = new int[count*2];
          arr[count++] = val;
     }

     public void print(){
          System.out.println(Arrays.toString(arr));
     }
}
