package Mastery;

import java.util.Random;

public class EventsAndOdds {
public static void main(String[] args) {
Random r = new Random();

System.out.print("ODD: ");
for (int i = 0; i < 25; i++) {
int num = r.nextInt(100);
if (num % 2 != 0)
System.out.print(num + " ");
}

System.out.print("\nEVEN: ");
for (int i = 0; i < 25; i++) {
int num = r.nextInt(100);
if (num % 2 == 0)
System.out.print(num + " ");
}
}
}