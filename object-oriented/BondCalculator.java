//Using bond formula price calculation: 

public class BondCalculator {

    public static double calculateBondPrice(double faceValue, double couponRate, double marketRate, int yearsToMaturity) {
        double price = 0.0;
        double annualCoupon = faceValue * couponRate;

        for (int t = 1; t <= yearsToMaturity; t++) {
            price += annualCoupon / Math.pow(1 + marketRate, t);
        }

        price += faceValue / Math.pow(1 + marketRate, yearsToMaturity);
        return price;
    }

    public static void main(String[] args) {
        double faceValue = 1000;
        double couponRate = 0.05;
        double marketRate = 0.04;
        int yearsToMaturity = 3;

        double price = calculateBondPrice(faceValue, couponRate, marketRate, yearsToMaturity);
        System.out.printf("Bond Price: %.2f\n", price);
    }
}

 
