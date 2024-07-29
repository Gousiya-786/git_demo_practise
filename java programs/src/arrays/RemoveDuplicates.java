package arrays;

public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int j = 1; // Pointer for placing non-duplicate elements
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; // Copy non-duplicate element to position j
                j++;
            }
        }
        
        return j; // j is now the new length of the array
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {1, 1, 2};
        int newLength = solution.removeDuplicates(nums);
        
        System.out.println("New length: " + newLength); // Output: 2
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(); // Output: 1 2
    }

}
