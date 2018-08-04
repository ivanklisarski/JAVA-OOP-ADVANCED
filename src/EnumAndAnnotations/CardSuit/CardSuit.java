package EnumAndAnnotations.CardSuit;

public enum CardSuit {
    CLUBS, DIAMONDS, HEARTS, SPADES;
    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toUpperCase();
    }
}
