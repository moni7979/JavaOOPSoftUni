package solid.products;

public class Chips implements Food{

    public static final double CALORIES_PER_100_GRAMS = 529.0;
    private double grams;

    public Chips(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }

    @Override
    public double findAmountCalories() {
        return getGrams() * (CALORIES_PER_100_GRAMS / 100);
    }

    @Override
    public double getAmountInKg() {
        return getGrams() / 1000;
    }
}
