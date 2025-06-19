package ex_Task_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check :");
        String input = scanner.next().toLowerCase();
        String reverse ="";
        for (int i = input.length()-1; i >= 0;i--)
        {
            reverse = reverse + input.charAt(i);
        }
        if(input.equals(reverse))
        {
            System.out.println("The given string is Palindrome");
        }else{
            System.out.println("The given string is not Palindrome");
        }
    }
}
