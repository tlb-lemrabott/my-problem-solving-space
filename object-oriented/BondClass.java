import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bond {
    private double faceValue;        // e.g. 1000
    private double couponRate;       // e.g. 0.05 for 5%
    private int yearsToMaturity;     // e.g. 5 years
    private double price;            // e.g. 950 (market price)
    private LocalDate issueDate;
    private LocalDate settlementDate;

    public Bond(double faceValue, double couponRate, int yearsToMaturity, double price,
                LocalDate issueDate, LocalDate settlementDate) {
        this.faceValue = faceValue;
        this.couponRate = couponRate;
        this.yearsToMaturity = yearsToMaturity;
        this.price = price;
        this.issueDate = issueDate;
        this.settlementDate = settlementDate;
    }

    // 1. Current Yield = Annual Coupon Payment / Market Price
    public double calculateCurrentYield() {
        double annualCoupon = faceValue * couponRate;
        return annualCoupon / price;
    }

    // 2. Accrued Interest = (Days since last coupon / Days in coupon period) * Annual Coupon Payment
    public double calculateAccruedInterest() {
        LocalDate lastCouponDate = issueDate.withYear(settlementDate.getYear());
        if (settlementDate.isBefore(lastCouponDate)) {
            lastCouponDate = lastCouponDate.minusYears(1);
        }

        long daysSinceLastCoupon = ChronoUnit.DAYS.between(lastCouponDate, settlementDate);
        long daysInCouponPeriod = 365; // Assuming annual coupon for simplicity

        double annualCoupon = faceValue * couponRate;
        return (daysSinceLastCoupon / (double) daysInCouponPeriod) * annualCoupon;
    }

    // Optional: Calculate approximate price from yield (simplified)
    public static double calculatePriceFromYield(double faceValue, double couponRate, double yield, int yearsToMaturity) {
        double annualCoupon = faceValue * couponRate;
        double price = 0;

        for (int t = 1; t <= yearsToMaturity; t++) {
            price += annualCoupon / Math.pow(1 + yield, t);
        }
        price += faceValue / Math.pow(1 + yield, yearsToMaturity); // add discounted principal
        return price;
    }

    

    public static void main(String[] args) {
        Bond bond = new Bond(
                1000,           // faceValue
                0.05,           // couponRate
                5,              // yearsToMaturity
                950,            // price
                LocalDate.of(2020, 1, 1),    // issueDate
                LocalDate.of(2023, 5, 16)    // settlementDate
        );

        System.out.printf("Current Yield: %.2f%%\n", bond.calculateCurrentYield() * 100);
        System.out.printf("Accrued Interest: $%.2f\n", bond.calculateAccruedInterest());

        double estPrice = Bond.calculatePriceFromYield(1000, 0.05, 0.06, 5);
        System.out.printf("Price from Yield (6%%): $%.2f\n", estPrice);
    }

}
