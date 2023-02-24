package abstraction.cardRank;

public class Main {
    public static void main(String[] args) {

        Card.Rank[] values = Card.Rank.values();
        System.out.println("Card Ranks:");
        for (Card.Rank card : values) {
            System.out.println("Ordinal value: "+ card.ordinal() + "; Name value: " + card.name());
        }

    }
}
