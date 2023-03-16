package solid;

import solid.products.*;

import java.util.List;

public class CalorieCalculator {

    public CalorieCalculator() {
    }


    public double getSum(List<Product> products) {
        double totalAmountSum = 0;

        for (Object product : products) {
            if (product instanceof Coke) {
                double grams = ((Coke) product).getMilliliters() * Coke.DENSITY;
                totalAmountSum += (Coke.CALORIES_PER_100_GRAMS / 100) * grams;
            }

            if (product instanceof Lemonade) {
                double grams = ((Lemonade) product).getMilliliters() * Lemonade.DENSITY;
                totalAmountSum += (Lemonade.CALORIES_PER_100_GRAMS / 100) * grams;
            }

            if (product instanceof Chocolate) {
                totalAmountSum += (Chocolate.CALORIES_PER_100_GRAMS / 100) * ((Chocolate) product).getGrams();
            }

            if (product instanceof Chips) {
                totalAmountSum += (Chips.CALORIES_PER_100_GRAMS / 100) * ((Chips) product).getGrams();
            }
        }

        return totalAmountSum;
    }

    public double getAverage(List<Product> products) {
        double totalAmountAverage = getSum(products) / products.size();
        return totalAmountAverage;
    }

}
