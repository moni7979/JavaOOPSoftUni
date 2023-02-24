package abstraction.cardSuit;

public class Main {

    enum CardSuit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;
    }

    public static void main(String[] args) {

        CardSuit[] values = CardSuit.values();
        System.out.println("Card Suits:");
        for (CardSuit card : values) {
            System.out.println("Ordinal value: " + card.ordinal() + "; Name value: " + card.name());
        }


    }
}
