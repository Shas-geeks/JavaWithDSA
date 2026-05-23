package Syntax_Practise_Qusn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sheet1_Syntax {
    public static void main(String [] args)
    {
        CalculateBill();
    }
    static void CalculateBill()
    {
        float TotalBill=0.0F;
        // For Item 1

        Scanner in=new Scanner(System.in); // Scaner Class is used to take the input and other functionality
        float Price1; int Quantity1;
        System.out.println("Enter The Price of Item1");
        Price1=in.nextFloat();
        System.out.println("Enter The Quantity of Item1");
        Quantity1=in.nextInt();

        TotalBill+=Price1*Quantity1;

        // For Item 2
        float Price2; int Quantity2;
        System.out.println("Enter The Price of Item2");
        Price2=in.nextFloat();
        System.out.println("Enter The Quantity of Item2");
        Quantity2=in.nextInt();

        TotalBill+=Price2*Quantity2;
        // For Item 3
        float Price3; int Quantity3;
        System.out.println("Enter The Price of Item3");
        Price3=in.nextFloat();
        System.out.println("Enter The Quantity of Item3");
        Quantity3=in.nextInt();

        TotalBill+=Price3*Quantity3;

        System.out.println("Total Bill"+TotalBill);

        if(TotalBill>500)
        {
            float Discount=((TotalBill)/100)*10;
            System.out.println("Total Bill After The Discount "+(TotalBill-Discount));
        }
        else{
            System.out.println("Discount Is Not Applicable for you  "+TotalBill);
        }

    }
}
