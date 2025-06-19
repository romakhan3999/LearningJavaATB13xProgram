package ex_Task_Programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year : ");

      //  System.out.println(scanner.hasNextInt());
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter the Int you Fool");
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
