package algorithms.Recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElemINArray {
     static int func(ArrayList<Integer>nums, int idx)
    {
        if(idx==nums.size()-1)return nums.get(idx);
        int Max1=nums.get(idx);
        int max2=func(nums,idx+1);
        int maxi=Math.max(max2,Max1);
        return maxi;
    }
    public static void main(String[] args) {
        System.out.print("Size Of Array: ");
        Scanner inp=new Scanner(System.in);
        int size=inp.nextInt();
        ArrayList<Integer>nums=new ArrayList<Integer>(size);
        for(int i=0;i<size;i++){
            int val=inp.nextInt();
            nums.add(val);
        }
        int Ans=func(nums,0);
        System.out.println("The Max Element In An array is " + Ans );
    }
}
