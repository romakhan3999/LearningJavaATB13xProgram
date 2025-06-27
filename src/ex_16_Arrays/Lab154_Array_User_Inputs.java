package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the Array(int) only");
        int size = sc.nextInt();

        int[] number_marks = new int[size];

//        float[] number_marks = new float[size];
//        String[] number_marks = new String[size];


        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter The Numbers");
            number_marks[i] = sc.nextInt();

        }
        System.out.println("-----Below Code is printing the Elements");

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println(number_marks[i]);

        }
    }
}
