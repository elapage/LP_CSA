/**
 * U of M High School Programming Competition Problem Pack
 * Problem #3 - pivot values
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Pack2016Problem3
{
    
    public static void main(String [] args)
    { 
        Scanner scanner;
        int numCases;

        //because we are dealing with files, we are required to use a try-catch for the exception
        // to be completed in class!   
        try
        {
            //use System.in for contests
            //scanner = new Scanner(System.in);
            //use a file for assignments - make sure it is in the
            //same directory as your class
            scanner = new Scanner(new File("input1.txt"));
            while(scanner.hasNextLine())
            {
                //get the number of cases
                numCases = Integer.parseInt(scanner.nextLine());

                for(int i = 1; i <= numCases; i++)
                {
                    runCases(i, scanner);
                }
            }
        }  
        catch(Exception e)
        {
            System.out.println("oopsie file problem");
            System.out.println(e.toString());
            e.printStackTrace();
        }

        //System.out.println("Program terminated");
    }

    public static void runCases(int caseNumber, Scanner scanner)
    {
        int [] infoList;    //index 0 - number of elements; index 1 - pivot value
        int [] values;      //the number values
        //the two sides of the list
        ArrayList<Integer> smallerThanPivot = new ArrayList<Integer>();
        ArrayList<Integer> greaterThanPivot = new ArrayList<Integer>();

        //get the next two lines; use a try-catch because we're dealing with input
        try
        {
            //get the pivot values
            infoList = getInfo(scanner.nextLine());

            //get the list
            values = getListNumbers(scanner.nextLine(), infoList[0]);

            //split the list based on the pivot
            splitList(values, smallerThanPivot, greaterThanPivot, infoList[1]);

            //display output
            output(caseNumber, smallerThanPivot, greaterThanPivot);
        }
        catch(Exception ioe)
        {
            System.out.println("Problem with reading a line");
            ioe.printStackTrace();
        }
    }

    /**
     * Prints the output for a case
     * @param caseNumber the specific case number
     * @param smallerThanPivot The values that are less than or equal to the pivot
     * @param greaterThanPivot The values that are greater than the pivot
     */
    public static void output(int caseNumber, ArrayList<Integer> smallerThanPivot, ArrayList<Integer> greaterThanPivot)
    {
        System.out.println("-CASE " + caseNumber + "-");
        printList(smallerThanPivot);
        printList(greaterThanPivot);
    }

    /**
     * Prints a specific list
     * @param list the list to print
     */
    public static void printList(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size() - 1; i++)
        {
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list.get(list.size() - 1));
    }

    /**
     * Splits the list based on the specified pivot
     * @param numbers The array of numbers to be split
     * @param smallerThanPivot The values from numbers that are smaller than or equal to the pivot
     * @param greaterThanPivot The values from numberds that are greater than or equal to the pivot
     * @param pivot The given pivot value
     */
    public static void splitList(int [] numbers, ArrayList<Integer> smallerThanPivot, ArrayList<Integer> greaterThanPivot, int pivot)
    {
        //loop through the list of numbers to compare each value to the pivot
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] <= pivot)
            {
                smallerThanPivot.add(numbers[i]);
            }
            else
            {
                greaterThanPivot.add(numbers[i]);
            }
        }
    }

    /**
     * Gets the list of numbers from the input
     * @param input The line of input
     * @param size The size of the list (the number of values)
     * @return
     */
    public static int [] getListNumbers(String input, int size)
    {
        int [] numbers = new int[size];
        //split the inputs based on whitespace
        String [] inputs = input.split("\\s+");

        //convert each string to a numbver and put each number in the list
        for(int i = 0; i<numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(inputs[i]);
        }

        return numbers;
    }

    /**
     * The information for the number of values and the pivot value are on one line of input.
     * This method separates the two values and returns 
     * @param input the input string from the file
     * @return an array where the first element is the number of values in the list and the second element is the pivot value
     */
    public static int [] getInfo(String input)
    {
        //use all whitespace as the delimiter when tokenizing the input string
        String [] tokens = input.trim().split("\\s+");
        int [] info = new int[tokens.length];

        for(int i = 0; i<tokens.length; i++)
        {
            info[i] = Integer.parseInt(tokens[i]);
        }

        return info;
    }
}
