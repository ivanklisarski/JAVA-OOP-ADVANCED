package EnumAndAnnotations.CardGame;

public class Card implements Comparable<Card>  {
    private CardRank cardRank;
    private CardSuit cardSuits;

    public Card(String rank, String suit) {
        this.setCardRank(rank);
        this.setCardSuits(suit);
    }

    private void setCardRank(String cardRank) {
        this.cardRank = Enum.valueOf(CardRank.class, cardRank.toUpperCase());
    }

    private void setCardSuits(String cardSuits) {
        this.cardSuits = Enum.valueOf(CardSuit.class, cardSuits.toUpperCase());
    }

    public CardRank getCardRank() {
        return this.cardRank;
    }

    public CardSuit getCardSuits() {
        return this.cardSuits;
    }

    public int getPower() {
        return this.getCardRank().getPower() + this.getCardSuits().getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s",
                this.getCardRank().name(),
                this.getCardSuits().name());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getCardRank() == card.getCardRank() &&
                getCardSuits() == card.getCardSuits();
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getPower(), o.getPower());

    }
}
