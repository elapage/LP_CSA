import java.util.Scanner;

public class GettingInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);   //read input from console
        int age;
        double digitsOfPi;  //digits of PI that they have memorized
        String name;

        System.out.print("Enter your current age: ");
        age = scanner.nextInt();

        System.out.println("Your current age is: " + age);

        System.out.print("Give all the digits of PI that you have memorized: ");
        digitsOfPi = scanner.nextDouble();
        System.out.println("You know these digits of PI: " + digitsOfPi);

        scanner.nextLine(); //gets rid of the floating newline character

        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.println("Your name is: " + name);
        
    }
}
