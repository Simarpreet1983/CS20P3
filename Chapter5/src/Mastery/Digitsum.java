package Mastery;

import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        int sum = 0;

        while (number > 0) {
            sum += number % 10;  // get last digit and add
            number /= 10;        // remove last digit
        }

        System.out.println("Digit sum: " + sum);

        input.close();
    }
}