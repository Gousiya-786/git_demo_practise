package arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        
        // Calculate prefix products
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        
        // Calculate suffix products
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        
        // Calculate result using prefix and suffix arrays
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        
        System.out.println("Output: " + Arrays.toString(result)); // Output: [24, 12, 8, 6]
    }
}
