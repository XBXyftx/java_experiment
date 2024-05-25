package help;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GasBill a = new GasBill();
        a.volume = input.nextDouble();
        double GasBill = a.getBill();

        WaterBill b = new WaterBill();
        b.volume = input.nextDouble();
        double WaterBill = b.getBill();

        System.out.println("该居民缴费总额为" + GasBill + WaterBill);
    }
}

abstract class Bill {
    protected double volume;

    public Bill() {

    }

    public Bill(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public abstract double getBill();
}

class GasBill extends Bill {
    private double rate = 2.28;

    public GasBill() {

    }

    public GasBill(double volume) {
        super(volume);
    }

    @Override
    public double getBill() {
        return rate * volume;
    }

}

class WaterBill extends Bill {
    private double rate[] = { 5, 7, 9 };

    public WaterBill() {

    }

    public WaterBill(double volume) {
        super(volume);
    }

    @Override
    public double getBill() {
        if (volume > 0 && volume <= 180) {
            return rate[0] * volume;
        }
        if (volume > 180 && volume <= 260) {
            return 900 + rate[1] * (volume - 180);
        } else {
            return 1460 + rate[2] * (volume - 260);
        }
    }
}
