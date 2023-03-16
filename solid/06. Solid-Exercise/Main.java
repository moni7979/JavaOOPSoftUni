package solid;

import solid.products.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product chips = new Chips(200);
        Product chocolate = new Chocolate(200);
        Product coke = new Coke(200);
        Product lemonade = new Lemonade(300);

        List<Product> productList = new ArrayList<>();
        productList.add(chips);
        productList.add(chocolate);
        productList.add(coke);
        productList.add(lemonade);

        CalorieCalculator calorieCalculator = new CalorieCalculator();
        Printer printer = new Printer();
        QuantityCalculator quantityCalculator = new QuantityCalculator();

        System.out.println("Calories: ");
        printer.printSum(calorieCalculator.getSum(productList));
        printer.printAverage(calorieCalculator.getAverage(productList));

        System.out.println();

        System.out.println("Kilograms: ");
        printer.printSum(quantityCalculator.getSumInKg(productList));
        printer.printAverage(quantityCalculator.getAverageValueKg(productList));


    }
}
