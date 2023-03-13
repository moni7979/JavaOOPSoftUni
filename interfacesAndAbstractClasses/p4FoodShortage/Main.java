package p4FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();
        for (int i = 0; i < n; i++) {

            Buyer man;
            String[] commandArr = scanner.nextLine().split(" ");
            switch (commandArr.length) {
                case 3:
                    man = new Rebel(commandArr[0], Integer.parseInt(commandArr[1]), commandArr[2]);
                    break;
                case 4:
                    man = new Citizen(commandArr[0], Integer.parseInt(commandArr[1]), commandArr[2], commandArr[3]);
                    break;
                default:
                    throw new IllegalArgumentException("No such man");
            }
            buyerMap.put(commandArr[0], man);
        }

        String people = scanner.nextLine();
        while (!people.equals("End")) {

            for (Map.Entry<String, Buyer> entry : buyerMap.entrySet()) {

                if (entry.getKey().equals(people)) {
                   entry.getValue().buyFood();
                }
            }
            people = scanner.nextLine();
        }

        int sumFood = 0;
        for (Map.Entry<String, Buyer> entry : buyerMap.entrySet()) {
           sumFood += entry.getValue().getFood();
        }

        System.out.println(sumFood);

    }
}
