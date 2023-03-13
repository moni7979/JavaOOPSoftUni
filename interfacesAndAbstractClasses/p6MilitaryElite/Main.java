package p6MilitaryElite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //TODO validation for corps, state

        String information = scanner.nextLine();
        while (!information.equals("End")) {

            String[] informationArr = information.split(" ");
            String soldierType = informationArr[0];

            switch (soldierType) {
                case "Private":
                    //TODO
                    break;
                case "LieutenantGeneral":
                    //TODO
                    break;
                case "Engineer":
                    //TODO
                    break;
                case "Commando":
                    //TODO
                    break;
                case "Spy":
                    //TODO
                    break;
                default:
                    //TODO
                    break;
            }

            information = scanner.nextLine();
        }

    }
}
