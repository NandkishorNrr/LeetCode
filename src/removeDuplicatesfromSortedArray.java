import java.util.Arrays;

public class removeDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums =  {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int length ;
        int temp = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[temp] == nums[i + 1])
                continue;
            nums[++temp] = nums[i + 1];
        }

        length = temp + 1;
//        System.out.println(Arrays.toString(nums));
        return length;
    }
}
