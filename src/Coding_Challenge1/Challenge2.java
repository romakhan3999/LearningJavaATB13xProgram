package Coding_Challenge1;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Integer Value : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Integer Value : ");
        int b = sc.nextInt();

        int add = a+b;
        int sub = a-b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Addition : " + add);
        System.out.println("substraction : " + sub);
        System.out.println("Multiplication : " + mul);
        System.out.println("Division : " + div);
        System.out.println("modulus : " + mod);
    }
}
