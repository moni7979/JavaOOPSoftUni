package p5Restaurant.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

    public final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    public final static double COFFEE_MILLILITERS = 50;

    private double caffeine;

    public Coffee(String name, BigDecimal price, double milliliters, double caffeine) {
        super(name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }

}
