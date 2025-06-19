package Coding_Challenge1;

import java.util.Scanner;

public class Challenge__7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Integer Value : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Integer Value : ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Integer Value : ");
        int c = sc.nextInt();

        if ( a > b){
            if( a > c )
            {
                System.out.println("Largest Number is : " + a);
            }else{
                System.out.println("Largest Number is : " + c);
            }
        }else if(b > c){
            if(b > a)
            {
                System.out.println("Largest Number is : " + b);
            }else{
                System.out.println("Largest Number is : " + a);
            }
        }else {
            System.out.println("Largest Number is : " + c);
        }
    }
}
