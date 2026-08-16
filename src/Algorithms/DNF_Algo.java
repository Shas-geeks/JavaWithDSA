package Algorithms;

import java.util.Collection;
import java.util.Scanner;

import static java.util.Collections.swap;

public class DNF_Algo {
    public static void swap(int [] nums, int idx1,int idx2){
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;
    }
    public static void DNFAlgo(int [] nums)
    {
        int i=0,j=0; int k=nums.length-1;
        while(j<=k){
            if(nums[j]==2)
            {
                swap(nums,j,k);
                k-=1;

            } else if (nums[j] == 0) {
                swap(nums,j,i);
                j+=1; i+=1;
            }
            else {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The Size Of Array");
        Scanner input =new Scanner(System.in);
        int size=input.nextInt();
        int [] nums=new int [size];
        for (int i=0;i<nums.length;i++)
        {
           int ans=input.nextInt();
           nums[i]=ans;
        }
        DNFAlgo(nums);
        for (int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+ " ");
        }
    }
}
