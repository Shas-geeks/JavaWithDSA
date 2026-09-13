package algorithms.Recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {
    public static ArrayList<String> subsequenceFn(String str)
    {
       if (str.isEmpty())
       {
          ArrayList<String>BaseCaseThatReturnToRecAns=new ArrayList<>();
          BaseCaseThatReturnToRecAns.add("");
          return BaseCaseThatReturnToRecAns;
       }
        char ch=str.charAt(0);  // 1
        String remStr=str.substring(1);  //2
        ArrayList<String>recAns=subsequenceFn(remStr);  //3
        ArrayList<String>myAns=new ArrayList<>();   //4
        for(String s:recAns)  // 5
        {
            myAns.add(""+s);  // 5.1
            myAns.add(s+ch);  // 5.2
        }

        return myAns;
    }
    public static void main(String[] args) {
        System.out.print("Enter The String: ");
        Scanner inp=new Scanner(System.in);
        String str=inp.next();
        ArrayList<String>Ans=subsequenceFn(str);
        System.out.println(Ans);
        System.out.println(Ans.size());

    }
}
