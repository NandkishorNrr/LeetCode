import javax.print.DocFlavor;
import java.util.*;

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

//        int[] nums1 = {1, 2};
//        int[] nums2 = {3, 4, 5};
//        System.out.println((findMedianSortedArrays(nums1, nums2)));

//        int[] nums = {0, 1};
//        System.out.println(canJump(nums));
//        System.out.println(minJump(nums));

//        int[] citations = {1,3,1};
//        System.out.println(hIndex(citations));

//        String s = "123";
//        var lMaxSbStr = lengthOfLongestSubstring2(s);
//        System.out.println(lMaxSbStr);

//        String s = "abcde";
//        String t = "abcdf";

//        System.out.println(t.contains(t));
//        var ch = findTheDifference(s, t);
//        System.out.println(ch);

//        String s = "babad";
//        System.out.println(longestPalindrome(s));
//        System.out.println(isPalindrome(s));

     /*   int[] nums = {1,2,3};
        nextPermutation(nums);*/
//        String[] strs = {"plower","flow","flight"};
//        String lCommon = longestCommonPrefix(strs);
//        System.out.println(lCommon);

//        String h = "sadbutsad";
//        String n = "sad";
//        System.out.println(h.indexOf("sad"));
//        String s = "A man, a plan, a canal: Panama";
//        var sP = isPalindromeAlp(s);
//        System.out.println(sP);

//        String s = "acb";
//        String t = "ahbgdc";
//        System.out.println(isSubsequence(s, t));

//        String s = "]";
//        System.out.println(isValid(s));

//        String s1 = "s1";
//        String s2 = "s1";
//        System.out.println(s1 == s2);

//        int[] nums = {1,2,3,1,1,3};
//        System.out.println(numIdenticalPairs2(nums));

//        int n = 19;
//
//        System.out.println(isHappy(n));
//        int[] nums = {2,3,1,2};
//        canBeIncreasing(nums);
//        System.out.println(Math.m);

//        int[] nums = {10,4,8,3};
//        var as = leftRightDifference(nums);
//        System.out.println(Arrays.toString(as));

//        int[] nums = {1,2,3,4,0};
//        int[] index = {0,1,2,3,0};
//        createTargetArray(nums, index);
//        String s = "ceabaacb";
//        System.out.println(minDeletions(s));
        int[] nums = {};
        var a = decompressRLElist(nums);
        System.out.println(Arrays.toString(a));

    }
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int f;
        int n;

        for(int i = 0; i < nums.length; i++){
            f = nums[i];
            n = nums[i + 1];
            while(f != 0){
                l.add(n);
                f--;
            }
        }
        int[] a = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }
    public static int minDeletions(String s) {
        int[] ca = new int[26];
        int delC = 0;
        for(char ch: s.toCharArray())
            ca[ch - 'a']++;

        Set<Integer> set = new HashSet<>();
        for(int c : ca){
            while(set.contains(c) && c > 0){
                c--;
                delC++;
            }
            set.add(c);
        }

        return delC;
    }
    public String restoreString(String s, int[] indices) {
        int len = indices.length;
        char[] sA  = new char[len];
        for(int i = 0; i < len; i++){
            sA[indices[i]] = s.charAt(i);
        }
        s = "";
        for (char ch: sA) {
            s += ch;
        }
        return s;
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> t = new ArrayList<>();
        int len = nums.length;
        int[] tr = new int[len];

        for (int i = 0; i < len; i++) {
            t.add(index[i], nums[i]);
        }

        for (int i = 0; i < len; i++) {
            tr[i] = t.get(i);
        }
        return tr;
    }
    public static int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] rs = new int[len];
        int[] ls = new int[len];
        int[] as = new int[len];

        if(len == 0)
            return as;

        ls[0] = 0;
        rs[len - 1] = 0;
        as[0] = Math.abs(ls[0] - rs[0]);

        if(len < 2)
            return as;

        ls[1] = nums[1];
        rs[len - 2] = nums[len - 1];
        as[1] = Math.abs(ls[1] - rs[1]);

        if(len < 3)
            return as;


        for(int i = 0; i < len - 2; i++){
            ls[i] = nums[i] + nums[i + 1];
        }
        for(int i = len - 3; i >= 0; i--){
            rs[i] = nums[i + 1] + nums[i + 2];
        }

        for(int i = 0; i < len; i++){
            as[i] = Math.abs(ls[i] - rs[i]);
        }

        return as;
    }
    public static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        var tA = nums;
        int in = 0;
        Arrays.sort(tA);
        for(int i = 0; i < tA.length - 1; i++){
            if(tA[i] == tA[i + 1])
                count++;
            if(nums[i] > nums[i + 1])
                in = i;
        }
        if(count <= 1){
            for (int i = in; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            for (int i = 1; i < nums.length - 2; i++) {
                if (nums[i] == nums[i + 1])
                    return false;
            }
        }
        else
            return false;
        return true;
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = sqr(slow);
            fast = sqr(sqr(fast));
        }
        while (slow != fast);

        if (slow == 1)
            return true;

        return false;
    }
    private static int sqr(int n){
        int sum = 0;
        int temp = n;
        int c;
        while(temp != 0){
            c = temp % 10;
            sum += c*c;
            temp /= 10 ;
        }
        return sum;
    }
    public static int numIdenticalPairs(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length - 1; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j])
                        count++;
                }
            }
            return count;
    }
    public static int numIdenticalPairs2(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j])
                    hm.put(j, i);
            }
        }
        return hm.size();
    }
    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for(char ch : s.toCharArray()){
            char pop = ' ';
            if(isOpen(ch)){
                brackets.push(ch);
            }
            else {
                if(!brackets.isEmpty())
                    pop = brackets.pop();
                if(!(ch == ')' && pop == '(' ||
                        ch == '}' && pop == '{' ||
                        ch == ']' && pop == '[')
                ) return false;
            }
        }
        return brackets.isEmpty();
    }
    private static boolean isOpen(char ch){
        String openBrc = "({[";
        return openBrc.contains(String.valueOf(ch));
    }
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        return i==s.length();
    }

    public static boolean isPalindromeAlp(String s) {
        s = s.toLowerCase();
        String nS = "";

        for(char ch : s.toCharArray()){
            if(isAlphaNum(ch))
                nS += ch;
        }
        var sArr = nS.toCharArray();
        int len = sArr.length;

        for(int i = 0; i < len; i++){
            if(sArr[i] != sArr[len - (1 + i)])
                return false;
        }
        return true;
    }
    private static boolean isAlphaNum(char ch){
       String alphaNum = "abcdefghijklmnopqrstuvwxyz0123456789";
        return alphaNum.contains(String.valueOf(ch));
    }
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String lCommon = "";
        int minWord = strs[0].length();
        for(int i = 1; i < len; i++){
            if(minWord > strs[i].length())
                minWord = strs[i].length();
        }
        int ptr = 0;
        char ch;
        while(ptr < minWord){
            ch = strs[0].charAt(ptr);
            for(int i = 1; i < len; i++){
                if(strs[i].charAt(ptr) != ch){
                    return lCommon;
                }
            }
            lCommon += ch;
            ptr++;
        }
        return lCommon;
    }


    /*public static void nextPermutation(int[] nums) {
        int brkP = 0;
        int len = nums.length;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                brkP = i;
                break;
            }
        }
        int temp = nums[brkP];
        int tempI = brkP;
        for(int i =  brkP + 1; i < len; i++){
            if(temp < nums[i]){
                tempI = i;
                break;
            }
        }
        swap(nums, brkP, tempI);
        Arrays.sort(nums, brkP, len);
        System.out.println(Arrays.toString(nums));
    }*/
    private static void swap(int[] arr, int p, int q){
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        String[] subStr = new String[len];
        boolean isPalindrome = false;
        String temp = "";
        String mxSubStr = "";

        for (int i = 0; i < len; i++){
            temp += s.charAt(i);
            subStr[i] = temp;
        }
        for (int j = 0; j < len; j++) {
            isPalindrome =  isPalindrome(subStr[j]);
            if (isPalindrome && mxSubStr.length() < subStr[j].length()){
                mxSubStr = subStr[j];
            }
        }
        return mxSubStr;
    }

    private static boolean isPalindrome(String s) {

        var charS = s.toCharArray();
        int len = charS.length;;
        for (int i = 0; i < len/ 2; i++) {
            if (charS[i] != charS[len - (1 + i)])
                return false;
        }
        return true;
    }

    public static char findTheDifference(String s, String t) {
        char ch = ' ';
        for (char c: t.toCharArray()) {
            if (!s.contains(String.valueOf(c))){
                ch = c;
                break;
            }
        }
        return ch;
    }
    public static int hIndex(int[] citations) {
        int len = citations.length;
        int hIndex = 0;
        int rEle = len - 1;
        Arrays.sort(citations);

        for (int i = 0; i < len; i++) {
            if (citations[i] < rEle){
                rEle--;
                hIndex++;
            }
            else
                break;
        }
        return hIndex;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int f = 0;
        int l = 0;
        int maxL = 0;
        int len = s.length();
        Queue<Character> q = new ArrayDeque();

        for (int i = 0; i < len; i++) {
            if (q.contains(s.charAt(i))){
                if (maxL < (l - f))
                    maxL = l - f;
                while (q.contains(s.charAt(i))) {
                    q.remove();
                    f++;
                }
            }
            q.add(s.charAt(i));
            l++;
            if (maxL < (l - f))
                maxL = l - f;
        }
        return maxL;
    }
    public static int minJump(int[] nums) {
        int minJump = 0;
        int len = nums.length;
        int desti = len - 1;
        int trv = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0)
                return minJump;
            minJump++;
            for (int j = 1; j <= nums[i]; j++) {
                trv = i + j;
                if (trv >= desti)
                    return minJump;
            }
        }
        return 0;
    }
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int desti = len - 1;

        for(int i = len - 2; i >= 0; i--){
            if(desti <= (i + nums[i]))
                desti = i;
        }
        return desti == 0;
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
    public static int lengthOfLongestSubstring(String s) {
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
