package solid.products;

public class Chocolate implements Food{

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }


    @Override
    public double getAmountInKg() {
        return getGrams() / 1000;
    }

    @Override
    public double findAmountCalories() {
        return getGrams() * (CALORIES_PER_100_GRAMS / 100);
    }
}
