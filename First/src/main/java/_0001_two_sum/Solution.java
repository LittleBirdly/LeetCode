package _0001_two_sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {

                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        int[] notfind = new int[2];
        notfind[0] = 8;
        notfind[1] = 8;
        return notfind;
    }

    public static void main(String... args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        for(int index : new Solution().twoSum(nums, target)) {
            System.out.println(index);
        }
    }
}


