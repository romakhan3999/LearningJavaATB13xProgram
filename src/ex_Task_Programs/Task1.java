package ex_Task_Programs;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side 1 of Traingle : ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter Side 2 of Traingle : ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter Side 3 of Traingle : ");
        double side3 = scanner.nextDouble();

        System.out.println(side1);
        System.out.println(side2);
        System.out.println(side3);

        if (side1 == side2)
        {
            if (side2 == side3)
            {
                System.out.println("Traingle is Eqilateral");
            } else
            {
                System.out.println("Traingle is Isosceles");
            }

        }
        else if(side1 == side3)
        {
            if (side2 == side3) {
                System.out.println("Traingle is Eqilateral");
            } else {
                System.out.println("Traingle is Isosceles");
            }
        }else
        {
            System.out.println("Traingle is Scalene");
        }

    }
}
