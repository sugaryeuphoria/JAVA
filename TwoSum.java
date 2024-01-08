public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Like, look at each number and see if its buddy is in the list
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Yay, found the buddies!
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    
}
