package solid;

import solid.products.Drink;
import solid.products.Food;
import solid.products.Product;

import java.util.List;

public class QuantityCalculator {

    public QuantityCalculator() {
    }

    public double getSumInKg(List<Product> productList) {

        double sum = 0.0;
        for (Product product : productList) {
            if (product instanceof Food) {
                double kilograms = ((Food)product).getAmountInKg();
                sum += kilograms;
            }

            if (product instanceof Drink) {
                double kilogramsDrink = ((Drink)product).getAmountInLiters() * ((Drink) product).getDensity();
                sum += kilogramsDrink;
            }
        }
        return sum;
    }

    public double getAverageValueKg(List<Product> productList) {
        double getAverageInKg = getSumInKg(productList) / productList.size();
        return  getAverageInKg;
    }

}
