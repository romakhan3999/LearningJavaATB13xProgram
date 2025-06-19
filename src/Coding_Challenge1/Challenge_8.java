package Coding_Challenge1;

import java.util.Scanner;

public class Challenge_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year : ");

        //  System.out.println(scanner.hasNextInt());
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter the Integer ");
            return;
        }
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " : Given year is a Leap year");
        }else {
            System.out.println(year + " : Given year is not a Leap year");
        }
    }
}
