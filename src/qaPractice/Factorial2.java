package qaPractice;

import java.util.Scanner;

public class Factorial2 {
    static int factorial (int n){
        if(n==0){
            return 1;

        }
        else {
            return n * factorial(n-1);

        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any number to calculate its factorial : ");
        int number = input.nextInt();
        System.out.println("Result: " + factorial(number));

    }
}
