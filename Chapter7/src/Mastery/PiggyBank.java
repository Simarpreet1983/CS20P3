package Mastery;

public class PiggyBank {
    private double total = 0;

    public void addPenny() {
        total += 0.01;
    }

    public void addNickel() {
        total += 0.05;
    }

    public void addDime() {
        total += 0.10;
    }

    public void addQuarter() {
        total += 0.25;
    }

    public void clear() {
        total = 0;
    }

    public double getTotal() {
        return total;
    }
}