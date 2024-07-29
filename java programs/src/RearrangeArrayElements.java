import java.util.Scanner;

public class RearrangeArrayElements {

	    public static void main(String[] args) {
	        RearrangeArrayElements rearrangeArrayElements = new RearrangeArrayElements();
	        rearrangeArrayElements.inputAcceptor();
	    }

	    public void inputAcceptor() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        if (!inputArraySizeValidator(size)) {
	            System.out.println("Give proper input");
	            return;
	        }

	        int[] inputArray = new int[size];

	        System.out.print("Enter the sorted array elements: ");
	        for (int i = 0; i < size; i++) {
	            inputArray[i] = scanner.nextInt();
	        }

	        if (!inputArrayValidator(inputArray)) {
	            System.out.println("Give proper input");
	            return;
	        }

	        int[] rearrangedArray = computeRearrangedArray(inputArray);
	        displayResult(rearrangedArray);
	    }

	    public boolean inputArraySizeValidator(int size) {
	        return size > 0;
	    }

	    public boolean inputArrayValidator(int[] input) {
	        if (input == null || input.length == 0) {
	            return false;
	        }

	        for (int i = 1; i < input.length; i++) {
	            if (input[i] < input[i - 1]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public int[] computeRearrangedArray(int[] inputArray) {
	        int[] result = new int[inputArray.length];
	        int left = 0, right = inputArray.length - 1;
	        boolean flag = true;

	        for (int i = 0; i < inputArray.length; i++) {
	            if (flag)
	                result[i] = inputArray[right--];
	            else
	                result[i] = inputArray[left++];
	            flag = !flag;
	        }

	        return result;
	    }

	    public void displayResult(int[] outputArray) {
	        if (outputArray == null || outputArray.length == 0) {
	            System.out.println("Give proper input");
	            return;
	        }

	        for (int num : outputArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	

}
