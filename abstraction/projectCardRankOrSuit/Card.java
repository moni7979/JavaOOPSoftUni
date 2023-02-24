package abstraction.projectCardRankOrSuit;

public class Card {

    enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES;
    }

    enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
    }

    static <E extends Enum<E>> void printEnums (Enum<E>[] values) {

        for (Enum<E> value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
        }

    }

}
