package ex_13_Functions;

import java.util.Scanner;

/**
 * This class provides basic arithmetic operations
 */

public class Lab134_Function_Arth {
    public static void main(String[] args) {
//        Create a Function of Sub, Sum, Mul and Div
//        with parameter a , b (take a parameter from user)

//        Logic Building
//        Step 1 -> Inputs and Outputs
//        a, b - int -> Scanner
//        int -> Variable Result ->


//        Step 2 -> Rough Logic ->Create Functions
//        function -> type 4th - with return and with arguments / parameters


//        Step 3 -> Write the code and Find and Fix -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if(scanner.hasNextInt()) {
            a = scanner.nextInt();
        }else{
            System.out.println("Enter the Int only");
//            return;
            System.exit(0);
        }
        System.out.println("Enter the num2");
        int b = 0;
        if(scanner.hasNextInt()) {
            b = scanner.nextInt();
        }else{
            System.out.println("Enter the Int only");
//            return;
            System.exit(0);
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);
    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    static int sum(int a, int b)
    {
        return a + b;
    }
    /**
     * Subtracts the second integers from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    static int sub(int a, int b)
    {
        return a - b;
    }
    /**
     * Divides the second integers from the first.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a and b
     */
    static int div(int a, int b)
    {
        if(b==0)
        {
           throw new ArithmeticException("B can't be Zero!");
//            System.out.println("B can't be Zero!");
//            System.exit(0);
        }
        return a/b;
    }
    static int mul(int a, int b)
    {
        return a * b;
    }
//    Mod
    static int mod(int a, int b)
    {
        return a % b;
    }
}
