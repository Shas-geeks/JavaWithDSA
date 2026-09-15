package algorithms.Recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class getKeypadCombination {
    public static void main(String[] args) {
        System.out.print("Enter the Number :");
        Scanner scn=new Scanner(System.in);
        String Number=scn.next();
        ArrayList<String>KeypadCombination=GetKeypadCombination(Number);
        System.out.println(KeypadCombination);
        System.out.println(KeypadCombination.size());
    }

    public static  ArrayList<String> GetKeypadCombination(String Number)
    {
        String [] str={
                "?!", // 0
                "abc", // 1
                "def",  //2
                "ghi",  // 3
                "jkl",  // 4
                "mnop",  // 5
                "qrst",  // 6
                "uv",    // 7
                "wxyz", // 8
                ","   // 9
        };
        if(Number.isEmpty())
        {
            ArrayList<String>SmallestAns=new ArrayList<>();
            SmallestAns.add("");
            return SmallestAns;
        }
        char ch=Number.charAt(0);
        String remStr=Number.substring(1);
        ArrayList<String>RecAns=GetKeypadCombination(remStr);
        ArrayList<String>MyAns=new ArrayList<>();
        int idx=ch-'0';  // 573
        String StrAns=str[idx];
        for(int i=0;i<StrAns.length();i++)
        {
            char character=StrAns.charAt(i);
            for(String rstr:RecAns)
            {
                MyAns.add(character+rstr);
            }
        }
        return MyAns;

    }

}
