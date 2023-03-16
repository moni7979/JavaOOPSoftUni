package solid.products;

public class Coke implements Drink{

    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    private double milliliters;

    public Coke(double milliliters) {
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double findAmountCalories() {
        double wightDrink = getMilliliters() * DENSITY;
        return (CALORIES_PER_100_GRAMS / 100) * wightDrink;
    }

    @Override
    public double getAmountInLiters() {
        return getMilliliters() / 1000;
    }

    @Override
    public double getDensity() {
        return DENSITY;
    }
}
