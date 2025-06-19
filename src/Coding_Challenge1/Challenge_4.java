package Coding_Challenge1;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Value : ");
        int i = sc.nextInt();

        System.out.println( "Pre Increment Value of i is : " + i + "\nPost Increment ++i : " + ++i);
        System.out.println("i++ value : " + i++ + " and i will be : "+ i);

        System.out.println( "Pre Decrement Value of i is : " + i + "\nPost Decrement --i : " + --i);
        System.out.println("i-- value : " + i-- + " and i will be : "+ i);
    }
}
