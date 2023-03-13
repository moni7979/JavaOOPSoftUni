package p12MultipleImpementation;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Birthable> inhabitantList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] commandArr = command.split(" ");

            Birthable inhabitant;
            switch (commandArr[0]) {
                case "Citizen":
                    inhabitant = new Citizen(commandArr[1], Integer.parseInt(commandArr[2]), commandArr[3], commandArr[4]);
                    break;
                case "Robot":
                    inhabitant = null;
                    break;
                case "Pet":
                    inhabitant = new Pet(commandArr[1], commandArr[2]);
                    break;
                default:
                    throw new IllegalArgumentException("No such inhabitant: " + commandArr[0]);
            }

            if (inhabitant != null) {
                inhabitantList.add(inhabitant);
            }

            command = scanner.nextLine();
        }

        String yearToCheck = scanner.nextLine();

        if (inhabitantList.size() != 0) {
            for (Birthable birthable : inhabitantList) {
                String y = birthable.getBirthDate().split("/")[2];
                if (y.equals(yearToCheck)) {
                    System.out.println(birthable.getBirthDate());
                }
            }
        }

    }
}
