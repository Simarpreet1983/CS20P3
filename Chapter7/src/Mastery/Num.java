package Mastery;

public class Num {
int number;

public Num(int n) {
number = n;
}

public int whole() {
return number;
}

public int ones() {
return number % 10;
}

public int tens() {
return (number / 10) % 10;
}

public int hundreds() {
return (number / 100) % 10;
}
}