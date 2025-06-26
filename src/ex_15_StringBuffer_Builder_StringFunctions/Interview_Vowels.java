package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Interview_Vowels {
    public static void main(String[] args) {
//        Java Program to count Vowels and Consonants
//          pramod -> a, i, e, o, u -> V - 2, C - 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.next();
//        char cc = input.charAt(0);

//        String input = "Java Program to Count Vowels and Consonants";
        int vowel = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowel++;
            }else {
                consonants++;
            }


        }

        System.out.println("Number of Vowels: "+ vowel);
        System.out.println("Number of Consonants: " + consonants);
    }
}
