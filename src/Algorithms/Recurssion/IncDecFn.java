package Algorithms.Recurssion;

import java.util.Scanner;

public class IncDecFn {
    public static void testfunc(int i,int n)
    {
        if(i==n+1)return;
        System.out.println(i);
        testfunc(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println("Enter The No For The Inc and Dec");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println("Starting recursion...");

        testfunc(1,n);
    }
}
