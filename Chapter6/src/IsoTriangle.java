import java.util.Scanner;

public class IsoTriangle {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.print("Enter pennies: ");
			int pennies = input.nextInt();

			System.out.print("Enter nickels: ");
			int nickels = input.nextInt();

			System.out.print("Enter dimes: ");
			int dimes = input.nextInt();

			System.out.print("Enter quarters: ");
			int quarters = input.nextInt();

			double total;

			total = (pennies * 0.01) +
			(nickels * 0.05) +
			(dimes * 0.10) +
			(quarters * 0.25);

			System.out.println("Total amount: $" + total);
			}
			}