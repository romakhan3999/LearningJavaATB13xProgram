package ex_Task_Programs;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
//        Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter The Number");
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter the Int you Fool");
            return;
        }
        int number = scanner.nextInt();

        int factorial = 1;

        if(number<0)
        {
            System.out.println("Negative Factorial is not Allowed!");
            return;
        }

        if(number <= 0) {
            System.out.println(factorial);
        }else{
//            Calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is -> " + factorial); //Print the calculated factorial
    }
}
