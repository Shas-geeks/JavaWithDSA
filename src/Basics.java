import java.util.Scanner;

public class Basics {
    public static void main(String [] args)
    {
       // Program to add two number take inoput and print
        // For Taking Input in java we use Scanner class object
        Scanner input=new Scanner(System.in);
         System.out.print("Please Take Input 1");
        int num1=input.nextInt();
        // 2nd Input
        System.out.println("Please Take Input 2");
         int num2=input.nextInt();
         int add=num1+num2;
        System.out.println("Your Additon of Two Number is "+add);

    }
}
