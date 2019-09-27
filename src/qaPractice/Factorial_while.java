package qaPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial_while {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number to find factorial: ");
        int number = input.nextInt();
        int i=1 , result=1;

        while(i<=number){
            result=result*i;
            i++;

        }
        System.out.println("Factorial of " + number + " is " + result);

    }
}
