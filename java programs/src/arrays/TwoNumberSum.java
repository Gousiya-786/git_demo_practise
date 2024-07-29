package arrays;
import java.util.*;
public class TwoNumberSum {
	
	public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store (element, index) pairs
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { numMap.get(complement), i };
            }
            
            // Put the current number and its index into the map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoNumberSum solution = new TwoNumberSum();
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
    }

}
