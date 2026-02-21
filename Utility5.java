import java.util.Scanner;
import java.util.InputMismatchException;
class Utility5
{
    public static long factorial(long val)
    {
        long fact = 1;
        for (int i = 1; i <= val; i++) 
        {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime(int val)
    {  int count=0;
        for (int i = 1; i <= val; i++) 
        {
            if (val % i == 0) 
            {
                count++;
            }
        }

        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static boolean isEven(long val)
    {
        if(val%2==0)
       {
            return true;
        }
        else
        {
            return false;
        }
    } 

    public static boolean isOdd(long val)
    {
        if(val%2==0)
       {
            return false;
        }
        else
        {
            return true;
        }
    } 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num = 0;
        boolean validInput = false;
        while (!validInput) 
        {
            try 
            {
                System.out.print("Enter only a number: ");
                num = sc.nextInt();
                validInput = true;
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid input! Please enter only numbers.");
                sc.nextLine(); // clear invalid input from buffer
            }
        }
        System.out.println("Factorial: " + factorial(num));
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Even? " + isEven(num));
        System.out.println("Is Odd? " + isOdd(num));


    }
}