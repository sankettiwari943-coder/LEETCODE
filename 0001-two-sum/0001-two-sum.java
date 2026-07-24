import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Finds indices of two numbers in nums that add up to target.
     * @param nums   Array of integers
     * @param target Target sum
     * @return Array of two indices
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            numToIndex.put(nums[i], i);
        }

        // Per problem constraints, this should never happen
        return new int[0];
    }
}
