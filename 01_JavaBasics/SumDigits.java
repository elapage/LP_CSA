/**
 * Takes in an integer and sums the digits
 * @author YOUR NAME HERE
 * @version Sept 20 2024
 */

import java.util.Scanner;

public class SumDigits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input;  //the number being input
        int sum;

        //take in a number from the user
        System.out.print("Enter a positive integer number: ");
        input = scanner.nextInt();

        //calculate the sum of the digits
        sum = calculateSum(input);

        System.out.println("The sum of the digits in " + input + " = " + sum);
    }

    /**
     * Calculates the sum of the given integer
     * @param currNumber the inputted value
     * @return the sum of the digits in the number
     */
    public static int calculateSum(int currNumber)
    {
        int sum = 0;

        //find each digit until there aren't any digits in the number!
        while(currNumber > 0)
        {
            //find the rightmost digit
            sum += currNumber % 10;

            //remove the rightmost digit
            currNumber /= 10;
        }

        return sum;
    }
}
