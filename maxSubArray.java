public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int bestSum = nums[0]; // Start with the first number
        int currentSum = nums[0]; // Keep track of the sum as we go

        // Look at each number and decide if it makes the sum better
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Choose the best option
            bestSum = Math.max(bestSum, currentSum); // Keep track of the best sum overall
        }

        return bestSum;
    }
}
