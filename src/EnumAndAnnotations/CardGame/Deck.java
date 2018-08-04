package EnumAndAnnotations.CardGame;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        seedCards();
    }

    public Iterable<Card> iterable() {
        return this.cards;
    }

    private void seedCards() {
        for (CardSuit suits : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                this.cards.add(new Card(rank.name(), suits.name()));
            }
        }
    }

    public boolean contains(Card card) {
        return this.cards.stream()
                .anyMatch(c -> c.equals(card));

    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }


}
