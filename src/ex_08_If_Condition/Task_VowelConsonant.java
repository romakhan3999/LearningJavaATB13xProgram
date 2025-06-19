package ex_08_If_Condition;

import java.util.Scanner;

public class Task_VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter The Character : ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
        {
            System.out.println("Given character is Vowel");
        }else if(ch>='a' && ch <='z'){
            System.out.println("Given character is Consonant");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
