import java.util.ArrayList;
import java.util.List;

public class AllTopics {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int listCount = 0;
        int i = 0;
        int j = 1;
        int k = 2;
        int sum;
        int trLen = nums.length - 3;

        for (int p = i; p < trLen; p++) {
            for (int l = j; l < trLen; l++) {
                for (int m = k; m < trLen; m++) {

                }

            }
            i++;
        }
        return list;
    }
}
