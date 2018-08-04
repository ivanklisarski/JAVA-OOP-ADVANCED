package EnumAndAnnotations.CardsWithPower;

@CustomEnumAnnotation(category = "Rank", description = "Provides suit constants for a Card class.")
public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    CardSuit(int value) {
        this.power = value;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toUpperCase();
    }
}
