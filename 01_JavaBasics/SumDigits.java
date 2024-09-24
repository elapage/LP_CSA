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
        int currNumber;
        int sum = 0;

        //take in a number from the user
        System.out.print("Enter a positive integer number: ");
        input = scanner.nextInt();

        //the currNumber starts as the input and will have digits removed
        //from it from right to left
        currNumber = input;

        //find each digit until there aren't any digits in the number!
        while(currNumber > 0)
        {
            //find the rightmost digit
            sum += currNumber % 10;

            //remove the rightmost digit
            currNumber /= 10;
        }

        System.out.println("The sum of the digits in " + input + " = " + sum);
    }
}
