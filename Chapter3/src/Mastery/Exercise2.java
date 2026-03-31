//This code ask's the user how much time it took to do each activity and then it shows the percentage of how long you spent. March 31 2026 Simarpreet Pelia


package Mastery;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Designing time: ");
		        int d = sc.nextInt();

		        System.out.print("Coding time: ");
		        int c = sc.nextInt();

		        System.out.print("Debugging time: ");
		        int db = sc.nextInt();

		        System.out.print("Testing time: ");
		        int t = sc.nextInt();

		        int total = d + c + db + t;

		        int dPct = d * 100 / total;
		        int cPct = c * 100 / total;
		        int dbPct = db * 100 / total;
		        int tPct = t * 100 / total;

		        System.out.println("\nTask\t% Time");
		        System.out.println("Designing\t" + dPct + "%");
		        System.out.println("Coding\t\t" + cPct + "%");
		        System.out.println("Debugging\t" + dbPct + "%");
		        System.out.println("Testing\t\t" + tPct + "%");

		        sc.close();
		    }
		

	}
