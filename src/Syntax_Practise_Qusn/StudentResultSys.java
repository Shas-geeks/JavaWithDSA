package Syntax_Practise_Qusn;

import java.util.Scanner;

public class StudentResultSys {
    public static void main(String[] args) {
        System.out.print("Enter The Mark of 5 Subjects :");
        // Always ClassName starts with Capital Letter
        // Scanner is a class where the input and all other method is present
        Scanner input=new Scanner(System.in); // We Created A Sacnner class object from Here we can acces the Method Directly
        float s1,s2,s3,s4,s5;
        s1=input.nextFloat();
        s2= input.nextFloat();
        s3= input.nextFloat();
        s4= input.nextFloat();
        s5=input.nextFloat();
        float TotalMarks=s1+s2+s3+s4+s5;
        System.out.println("Total Marks "+TotalMarks);
        float  percentage=(int)(((TotalMarks)/500)*100);
        System.out.println("Total Percentage "+percentage);
        if(percentage>90)
        {
            System.out.println("A");

        } else if (percentage>75 && percentage<=90) {
            System.out.println("B");
        }
        else if(percentage>60 && percentage<=75)   System.out.println("C");
        else if (percentage>40 && percentage<=60){
            System.out.println("D");
        }
        else   System.out.println("Fail");


    }
}
