
import java.util.Scanner;

public class Calculator {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    // Method to get input values and perform calculations
    public void getValues(Scanner scan) {
        char repeat;
        do {
            System.out.println("Enter the first number:");
            int firstValue = scan.nextInt();

            System.out.println("Enter the second number:");
            int secondValue = scan.nextInt();

            System.out.println("Enter number beside the operation to perform:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int operator = scan.nextInt();

            String result = calculate(firstValue, secondValue, operator);
            System.out.println(result);

            System.out.println("Do you want to try again (y/n)?");
            repeat = scan.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');
    }

    // Method to perform calculation based on operator and return formatted result string
    public String calculate(int firstValue, int secondValue, int operator) {
        int result = 0;
        String output = "";

        switch (operator) {
            case 1:
                result = firstValue + secondValue;
                output = firstValue + " + " + secondValue + " = " + result;
                break;
            case 2:
                result = firstValue - secondValue;
                output = firstValue + " - " + secondValue + " = " + result;
                break;
            case 3:
                result = firstValue * secondValue;
                output = firstValue + " * " + secondValue + " = " + result;
                break;
            case 4:
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                    output = firstValue + " / " + secondValue + " = " + result;
                } else {
                    output = "The divider (secondValue) cannot be zero";
                }
                break;
            default:
                output = "Entered wrong option " + operator;
                break;
        }

        return output;
    }
}


