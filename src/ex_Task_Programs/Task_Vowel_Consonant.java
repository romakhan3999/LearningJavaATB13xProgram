package ex_Task_Programs;

import java.util.Scanner;

public class Task_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word : ");
        String input = scanner.nextLine().toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(Character.isLetter(ch))
            {
                if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowel++;
                }else{
                    consonant++;
                }
            }


        }
        System.out.println("Vowels : "+vowel);
        System.out.println("consonant : "+consonant);
    }
}
