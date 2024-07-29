package arrays;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element
        int currentSum = nums[0]; // Initialize currentSum with the first element
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = solution.maxSubArray(nums);
        
        System.out.println("Maximum sum of contiguous subarray: " + maxSum); 
    }

}
