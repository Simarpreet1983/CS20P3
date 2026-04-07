
// This program does any quadratic equation given and tells if it has no real roots

//4/6/2026 Simarpreet Pelia


package Mastery;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("type in your first number: ");
		int a = input.nextInt();
		System.out.println("type in your second number: ");
		int b = input.nextInt();
		System.out.println("type in your third number c: ");
		int c = input.nextInt();

		 if (a == 0) {
	            System.out.println("Not a quadratic equation.");
	        } else {
	            double d = b * b - 4 * a * c;

	            if (d > 0) {
	                double r1 = (-b + Math.sqrt(d)) / (2 * a);
	                double r2 = (-b - Math.sqrt(d)) / (2 * a);
	                System.out.println("Roots: " + r1 + " and " + r2);
	            } 
	            else if (d == 0) {
	                double r = -b / (2 * a);
	                System.out.println("Root: " + r);
	            } 
	            else {
	                System.out.println("No real roots.");
	            }
	        }

	        input.close();
	    }
	}