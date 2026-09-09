package algorithms.Recurssion;

import java.util.Scanner;

public class zigzag {
    public static final void func(int n)
    {
        if(n==0) return;
        System.out.println("Pre"+n);
        func(n-1);
        System.out.println("In"+n);
        func(n-1);
        System.out.println("post"+n);
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int inp=input.nextInt();

        func(inp);
    }
}
