package encapsulation.shoppingSpree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] personInput = scanner.nextLine().split(";");
        if (personInput.length == 1) {
            String name = personInput[0].split("=")[0];
            double money = Double.parseDouble(personInput[0].split("=")[1]);
            //TODO
        } else if (personInput.length == 2) {
            //TODO
        }

    }
}
