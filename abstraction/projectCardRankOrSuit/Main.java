package abstraction.projectCardRankOrSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        if (command.equals("Card Suits")) {
            System.out.println("Card Suits:");
            Card.printEnums(Card.Suit.values());
        } else if (command.equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            Card.printEnums(Card.Rank.values());
        }

    }
}
