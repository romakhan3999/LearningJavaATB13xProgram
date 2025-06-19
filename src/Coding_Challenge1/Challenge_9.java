package Coding_Challenge1;

import java.util.Scanner;

public class Challenge_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number between 1 to 7 : ");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter the Valid Number between 1 to 7");
            return;
        }
        int a = sc.nextInt();
        switch (a){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter Correct Number from 1 to 7");
        }
    }
}
