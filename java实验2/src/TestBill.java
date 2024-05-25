import java.util.Scanner;

public class TestBill {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Waterbill waterbill = new Waterbill(sc.nextDouble());
        Gasbill gasbill = new Gasbill(sc.nextDouble());
        double sum = gasbill.getBill() + waterbill.getBill();
        System.out.println("该居民缴费总额为" + sum);
        sc.close();
    }
}

abstract class Bill {
    protected double volume;

    public Bill() {
        this.volume = 0.0;
    }

    public Bill(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public abstract double getBill();
}

class Gasbill extends Bill {
    private double rate;

    public Gasbill() {
        super();
    }

    public Gasbill(double volume) {
        super(volume);
    }

    public double getBill() {
        double rate = 2.28;
        double gasbill = rate * volume;
        return gasbill;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

class Waterbill extends Bill {
    private double[] rate = { 5, 7, 9 };

    public Waterbill() {

    }

    public Waterbill(double volume) {
        super(volume);
    }

    public double getBill() {
        double waterbill = 0.0;
        if (volume <= 180 || volume >= 0) {
            waterbill = rate[0] * volume;
        } else if (volume >= 181 || volume <= 260) {
            waterbill = rate[1] * (volume - 180) + rate[0] * 180;
        } else if (volume > 260) {
            waterbill = rate[2] * (volume - 260) + rate[1] * 80 + rate[0] * 180;
        }
        return waterbill;
    }
}