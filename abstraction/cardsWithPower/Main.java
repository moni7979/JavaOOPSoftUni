package abstraction.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        Card card = new Card(Card.Rank.valueOf(cardRank), Card.Suit.valueOf(cardSuit));

        int sum = card.rank.getPower() + card.suit.getPower();
        System.out.println("Card name: "+ card.rank +" of "+ card.suit +"; Card power: " + sum);
    }
}
