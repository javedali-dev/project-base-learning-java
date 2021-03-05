package assignment;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        Scanner c=new Scanner(System.in);

        String s,s1;
        s=c.nextLine();
        s1=c.nextLine();

        String ans=" ";
        for(int i=0;i<s.length();i++)
        {
            ans+=s.charAt(i);
            ans+=s1.charAt(i);
        }

        System.out.println(ans);


    }
}
