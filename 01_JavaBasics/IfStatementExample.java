/**
 * An example using If Statements. Calculate a salesperson's
 * salary based on a commission table
 * @version Sept 15 2023
 */

import java.util.Scanner;

public class IfStatementExample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double salesMade;   //the sales the salesperson made in the month
        double salary = 0;
        double commission = 0.0;
        double baseSalary = 0;

        //get input
        System.out.print("How much did you sell this month? ");
        salesMade = scanner.nextDouble();

        //check how much the salary is
        if(salesMade >= 50000)
        {
            baseSalary = 375;
            commission = 0.16;
        }
        else if(salesMade < 50000 && salesMade >= 40000)
        {
            baseSalary = 350;
            commission = 0.14;            
        }
        else if(salesMade < 40000 && salesMade >= 30000)
        {
            baseSalary = 325;
            commission = 0.12;            
        }
        else if(salesMade < 30000 && salesMade >= 20000)
        {
            salary = 300 + 0.09 * salesMade;
            
        }
        else if(salesMade < 20000 && salesMade >= 10000)
        {
            salary = 250 + 0.05 * salesMade;
        }
        else if(salesMade < 10000)
        {
            salary = 200 + 0.03 * salesMade;
        }
        else
        {
            //a default condition is never a bad thing to have! Can get over this by
            //initializing the value to 0.
            baseSalary = 0;
            commission = 0.0;
        }

        salary = baseSalary + commission * salesMade;
        System.out.println("You made $" + salary + " this month");

    }
}
