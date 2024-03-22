package twosum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexes.containsKey(complement)) {
                return new int[] {numIndexes.get(complement), i};
            }
            numIndexes.put(nums[i], i);
        }
        return new int[0];
    }
}
