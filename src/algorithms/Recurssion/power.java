package algorithms.Recurssion;

import java.util.Scanner;

public class power {
    public static final int func(int x,int n)
    {

        if(n==0) return 1;
        return x*func(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter The Base And Power For Calculation");
        Scanner input=new Scanner(System.in);
        int Base=input.nextInt();
        int pow=input.nextInt();
        System.out.println("The Power Function Return :"+ func(Base,pow));
    }
}
