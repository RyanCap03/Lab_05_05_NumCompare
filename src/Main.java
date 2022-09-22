public class Main
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 9;

        if (num1 == num2)
        {
            System.out.println("Your numbers are equal!");
        }
        else if (num1 > num2)
        {
            System.out.println("Your first number " +num1+ " is greater than the second number " +num2 + "! ");
        }
         else if (num1 < num2)
        {
            System.out.println("Your second number " +num2+ " is greater than the first number " +num1+ "! ");
        }
        else
        {
            System.out.println("you did not enter 2 numbers, try again!");
        }


    }
}