import java.util.Arrays;
import java.util.LinkedList;

public class TopInterview_150 {
    public static void main(String[] args) {
        //        int[] nums1 = {0};
//        int[] nums2 = {1};
//        merge(nums1, 0, nums2, 1);

//        int nums[] = {0,1,2,2,3,0,4,2};
//        int val = 2;
//        System.out.println(removeElement(nums, val));

//        int[] arr = {1,2,3,4,5,6,7};
//        int k = 5;
//        rotate(arr, k);

//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));

//        LinkedList<Integer> l1 = new LinkedList<>();
//        LinkedList<Integer> l2 = new LinkedList<>();
//        l1.add(2);
//        l1.add(4);
//        l1.add(3);
//
//        l2.add(5);
//        l2.add(6);
//        l2.add(4);
//
//        addTwoNumbers(l1, l2);

//        String s = "pwwkew";
////        System.out.println(s.substring(0, 3));
//        System.out.println(lengthOfLongestSubstring2(s));

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5};
        System.out.println((findMedianSortedArrays(nums1, nums2)));
//        int n = 5;
//        System.out.println( ((double)n / 2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = 0;
        var merge = merge(nums1, nums2);
//        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(nums2));
//        System.out.println(Arrays.toString(merge));
        int len = merge.length;
        if (len % 2 == 0)
            mid = (double) (merge[len/2 - 1] + merge[len/2]) / 2;
        else
            mid = merge[len / 2];
//        System.out.println(mid);
        return mid;
    }
    private static int[] merge(int[] nums1, int[] nums2){
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] merge = new int[l1 + l2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l1 && j < l2){
            if (nums1[i] < nums2[j])
                merge[k++] = nums1[i++];
            else
                merge[k++] = nums2[j++];
        }
        while (i < l1)
            merge[k++] = nums1[i++];
        while (j < l2)
            merge[k++] = nums2[j++];

        return merge;
    }
    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int p = 0;
        int q = 0;
        int i = 0;

        while ((p < nums1.length && q < nums2.length)){
            if(nums1[p] < nums2[q])
                arr[i++] = nums1[p++];
            else
                arr[i++] = nums2[q++];
        }

        if (nums1.length <= nums2.length && q < p)
            while (q < nums2.length)
                arr[i++] = nums2[q++];
        else
            while (p < nums1.length)
                arr[i++] = nums1[p++];

        if(len % 2 == 0) {

            return (((double)(arr[len / 2 - 1])  + (double) arr[len / 2]) / 2);
        }
        return arr[len / 2];
    }
    public static int lengthOfLongestSubstring2(String s) {
        String ls = "";
        String ts = "";

        for (char ch : s.toCharArray()) {
            if(!ts.contains(String.valueOf(ch)))
                ts += ch;
            else{
                if(ls.length() < ts.length())
                    ls = ts;
                ts = String.valueOf(ch);
            }
        }
        if(ls.length() < ts.length())
            return ts.length();
        return ls.length();
    }
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> sum = new LinkedList<>();
        int n1 = 0;
        int n2 = 0;
        int s;
        while (!l1.isEmpty()){
            n1 = n1*10 + l1.remove();
        }
        while (!l2.isEmpty()){
            n2 = n2*10 + l2.remove();
        }
        s = n1 + n2;
        while (s != 0){
            sum.add(s % 10);
            s /= 10;
        }
        return sum;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*if(nums1.length > 0 && nums2.length > 0){
            int i = 0;
            int j = 0;
            int k = 0;
            int[] tempArr = new int[m + n];
//            System.out.println(tempArr.length);
            for(int p = 0; p < tempArr.length; p++){
                if(nums1[i] < nums2[j] && i < m)
                    tempArr[k++] = nums1[i++];
                else
                    tempArr[k++] = nums2[j++];
            }
            nums1 = tempArr;
            System.out.println(Arrays.toString(nums1));
        }*/
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p2 >= 0){
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p--] = nums1[p1--];
            }
            else
                nums1[p--] = nums2[p2--];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int buy = prices[0];
        int sell;
        int cProfit;
        for (int i = 1; i < prices.length; i++) {
            sell = prices[i];
            cProfit = sell - buy;
            if (cProfit < 0)
                buy = prices[i];
            else if (0 < cProfit){
                maxProfit += cProfit;
                buy = prices[i];
            }
        }
        return maxProfit;
    }
    public static void rotate(int[] nums, int k){
        int len = nums.length;
        int[] rNum = new int[len];
        for (int i = k; i < len; i++) {
            rNum[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            rNum[i] = nums[len - k + i];
        }
        nums = rNum;
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        int ptr;
        for(int i = 0; i < len; i++){
            if(val == nums[i]){
                ptr = i;
                while(val == nums[ptr] && ptr < len - 1)
                    ptr++;

                nums[i] = nums[ptr];
                count++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return len - count;
    }
}
