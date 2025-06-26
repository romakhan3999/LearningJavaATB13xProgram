package ex_14_Strings;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String");
        String s1 = scanner.next().toLowerCase();


        String s1_reverse ="";
        for(int i = s1.length()-1; i>=0 ; i--)
        {
            s1_reverse = s1_reverse + s1.charAt(i);
        }
       if(s1.equals(s1_reverse))
       {
           System.out.println(s1+" Given string is Palindrome");
       }else{
           System.out.println(s1+" Given string is not Palindrome");
       }

    }
}
