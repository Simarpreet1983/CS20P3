//This code takes in the mass in kg and converts it into energy and shows how many light bulbs it can power per second. March 31 2026 Simarpreet Pelia

package Mastery;
import java.util.Scanner;
public class Energy {
	
public class EnergyCalculator {

public static void main(String[] args) {
		

		
		        
		      Scanner input = new Scanner(System.in);

		        // ask user for  the mass
		        System.out.print("Enter mass in kilograms: ");
		        double mass = input.nextDouble();

		        // speed of light =
		        double c = 3.0e8;

		        // calculating energy in joules
		        double energy = mass * c * c;

		        // number of 100W bulbs
		        double bulbs = energy / 100;

		       
		        System.out.println("Energy (joules): " + energy);
		        System.out.println("Number of 100W light bulbs (per second): " + bulbs);

		        input.close();
		    }
		}
	}


