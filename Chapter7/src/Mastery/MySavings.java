package Mastery;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();

        int choice;

        do {
            System.out.println("1. Show");
            System.out.println("2. Penny");
            System.out.println("3. Nickel");
            System.out.println("4. Dime");
            System.out.println("5. Quarter");
            System.out.println("6. Clear");
            System.out.println("7. Exit");

            choice = input.nextInt();

            if (choice == 1)
                System.out.println(bank.getTotal());
            else if (choice == 2)
                bank.addPenny();
            else if (choice == 3)
                bank.addNickel();
            else if (choice == 4)
                bank.addDime();
            else if (choice == 5)
                bank.addQuarter();
            else if (choice == 6)
                bank.clear();

        } while (choice != 7);

        input.close();
    }
}