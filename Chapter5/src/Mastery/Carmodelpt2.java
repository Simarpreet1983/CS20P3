package Mastery;
import java.util.Scanner;

public class Carmodelpt2 {
	 

	public static void main(String[] args) {
	        int target;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter car model numbers (enter 0 to stop):");

	        target = scanner.nextInt();

	        while (target != 0) {

	            if (target == 119 || target == 179 || target == 189 ||
	                target == 190 || target == 191 || target == 192 ||
	                target == 193 || target == 194 || target == 195 ||
	                target == 221 || target == 780) {

	                System.out.println("The car number is: " + target + 
	                                   " and is defective and it needs to be repaired");
	            } else {
	                System.out.println("The car number is: " + target + 
	                                   " it doesn't need to be repaired");
	            }

	            // ask again
	            System.out.println("\nEnter another model number (0 to stop):");
	            target = scanner.nextInt();
	        }

	        System.out.println("Program ended.");
	    }

	}


