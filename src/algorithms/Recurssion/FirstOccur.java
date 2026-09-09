package algorithms.Recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstOccur {
    public static int FunFirstOccur(ArrayList<Integer>nums,int i, int target)
    {
        if(i>=nums.size()) return -1;
        if(nums.get(i)==target) return i;
       return  FunFirstOccur(nums,i+1,target);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter The Size and Array ");
        int sz=scn.nextInt();
        ArrayList<Integer>nums=new ArrayList<>(sz);
        for(int i=0;i<sz;i++)
        {
            int val=scn.nextInt();
            nums.add(val);
        }
        System.out.println("Enter The Target To Be found ");
        int target=scn.nextInt();
        int FistOccurIdx=FunFirstOccur(nums,0,target);
        if(FistOccurIdx==-1) System.out.println("Target Index Not Found");
        else System.out.println("Target Index found at "+ FistOccurIdx);
    }
}
