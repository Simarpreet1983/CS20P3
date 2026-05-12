package Mastery;

import java.util.Random;

public class RandomStats {
public static void main(String[] args) {
Random r = new Random();
int[] count = new int[10];

for (int i = 0; i < 500; i++) {
int num = r.nextInt(10);
count[num]++;
}

System.out.println("Number Occurrences");
for (int i = 0; i < 10; i++) {
System.out.println(i + " " + count[i]);
}
}
}
 