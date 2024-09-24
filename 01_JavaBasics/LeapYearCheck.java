import java.util.Scanner;

public class LeapYearCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int year;   //the year from the user that needs to be checked
        boolean isLeapYear; //the result following leap year rules

        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        //set my leap year result to false, and only change if true
        isLeapYear = false;

        //check to see if the year is divisible by 4
        if(year % 4 == 0)
        {
            //then check if the year is divisible by 100 as it may
            //not be a leap year
            if(year % 100 == 0)
            {
                //however! if it is divisble by 400 then it is leap year
                //otherwise, it is not
                if(year % 400 == 0)
                {
                    isLeapYear = true;
                }
            }
            else
            {
                //the leap year is not a century
                isLeapYear = true;
            }
        }

        if(isLeapYear)  //isLeapYear == true
        {
            System.out.println("The year " + year + " is a leap year.");
        }
        else
        {
            System.out.println("The year " + year + " is NOT a leap year.");
        }
    }
    
}
