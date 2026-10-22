package algorithms.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class CountMaxFreqString {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter The String : ");
        String str=inp.next();
        System.out.println("Max  Char  is   =>  "+  CountMaxFreq(str));

    }
    public static char CountMaxFreq(String str)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i); // Give the string character at I position equivalent =S[i]
            if(hm.containsKey(ch))   // if in hasmap this char 's' exist
            {
                int OldFreq=hm.get(ch);
                int NewFreq=OldFreq+1;
                hm.put(ch,NewFreq);
            }
            else{
                hm.put(ch,1);

            }
        }
        char AnsChar=str.charAt(0);
        int maxFreq=hm.get(AnsChar);
        for(char ch:hm.keySet())
        {
            if(hm.get(AnsChar)<hm.get(ch)){
                maxFreq=hm.get(ch);
                AnsChar=ch;
            }
        }
        return AnsChar;
    }
}
