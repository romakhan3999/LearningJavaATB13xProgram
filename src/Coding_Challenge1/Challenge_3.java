package Coding_Challenge1;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Integer Value : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Integer Value : ");
        int b = sc.nextInt();

        System.out.println("a == b: " +(a==b));
        System.out.println("a > b: " +(a > b));
        System.out.println("a < b: " +(a < b));
        System.out.println("(a > b) && (a > 0): " +((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0) : "+((a < b) || (a > 0)));
        System.out.println("!(a > b): " + !(a > b));

    }
}
