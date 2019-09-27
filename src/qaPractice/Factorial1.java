package qaPractice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Factorial1 {

    static int factorial (int n ){
        int result = 1;
        for (int i =2; i <=n; i++){
            result = result*i;

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type any integer to calculate its factorial: ");
        int number= input.nextInt();
        System.out.println("Factorial of number: " + number + " is " + factorial(number));

    }
}
