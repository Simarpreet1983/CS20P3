import java.util.Scanner;

public class DigitExtractor {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int n = input.nextInt();

Num num = new Num(n);

char choice;

do {
System.out.println("W - Whole number");
System.out.println("O - Ones digit");
System.out.println("T - Tens digit");
System.out.println("H - Hundreds digit");
System.out.println("Q - Quit");

System.out.print("Choice: ");
choice = input.next().charAt(0);

if (choice == 'W' || choice == 'w')
System.out.println(num.whole());
else if (choice == 'O' || choice == 'o')
System.out.println(num.ones());
else if (choice == 'T' || choice == 't')
System.out.println(num.tens());
else if (choice == 'H' || choice == 'h')
System.out.println(num.hundreds());

} while (choice != 'Q' && choice != 'q');
}
}
