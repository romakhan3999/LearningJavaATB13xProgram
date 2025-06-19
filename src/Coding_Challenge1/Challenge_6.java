package Coding_Challenge1;

import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        if (num >0){
            System.out.println(num + " is Positive");
        }else if(num == 0){
            System.out.println(num + " is Zero");
        }else{
            System.out.println(num + " is Negative");
        }
    }
}
