import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
       /* int[] nums = {};
        int target = 2;
        var range = searchRange(nums, target);
        System.out.println(Arrays.toString(range));*/

       /* String word1 = "abc";
        String word2 = "pqr";
        var merge = mergeAlternately(word1, word2);
        System.out.println(merge);*/

        /*char[] letters = {'c', 'f', 'j'};
        var target = 'a';
        var smlLtr = nextGreatestLetter2(letters, target);
        System.out.println(smlLtr);*/

        /*int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};
        var nCound = countNegatives(grid);
        System.out.println(nCound);*/
        RandomizedSet r = new RandomizedSet();
        System.out.println(r.insert(5));
        System.out.println(r.remove(6));
        System.out.println(r.getRandom());
    }
    static class RandomizedSet {
        List<Integer> set;
        public RandomizedSet() {
            List<Integer> set = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (set.contains(val))
                return false;

            set.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (set.contains(val)){
                set.remove(val);
                return true;
            }
            return false;
        }

        public int getRandom() {
            var minRange = 0;
            var maxRange = set.size();
            int rnd = (int) (Math.random() * (maxRange - minRange + 1)) + minRange;
            return set.get(rnd);
        }
    }

    public static int countNegatives(int[][] grid) {
        int nCount = 0;
        int s;
        int e;
        int mid;
        int cLen;

        for (int i = 0; i < grid.length; i++) {
            cLen = grid[i].length;
            s = 0;
            e = cLen - 1;
            while (s <= e){
                mid= (s + e) / 2;
                if (grid[i][mid] < 0){
                    e = mid - 1;
                }
                else
                    s = mid + 1;
            }
            nCount += cLen - s;
        }
        return nCount;
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int cIn = 0;
        int len = letters.length;
        for(int i = 0; i < len - 1; i++){
            if (letters[i] <= target)
                cIn = i;
        }
        if (cIn < len - 1)
            return letters[cIn + 1];
        return letters[0];
    }
    public static char nextGreatestLetter2(char[] letters, char target) {
        int s = 0;
        int e = letters.length;
        int mid;
        while (s < e){
            mid = (s + e) / 2;
            if (target == letters[mid])
                return letters[mid + 1];
            else if(target < letters[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        return letters[0];
    }
    public static String mergeAlternately(String word1, String word2) {
        String merge = "";
        int l1 = word1.length();
        int l2 = word2.length();
        int i = 0;

        while(i < l1 && i < l2){
            merge += word1.charAt(i);
            merge += word2.charAt(i++);
        }
        while(i < l1){
            merge += word1.charAt(i++);
        }
        while(i < l2){
            merge += word2.charAt(i++);
        }

        return merge;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] pos = {-1, -1};
        int len = nums.length ;
        int s = 0;
        int e = len - 1;
        int mid;
        while(s <= e){
            mid = (s + e) / 2;
            if(target == nums[mid]){
                s = mid;
                e = mid;
                while(s - 1 >= 0 && target  == nums[s - 1])
                    s--;
                while(e + 1 < len && target == nums[e + 1])
                    e++;
                pos[0] = s;
                pos[1] = e;
                return pos;
            }
            else if(target < nums[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        return pos;
    }
}
