package EnumAndAnnotations.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deck cardDeck = new Deck();
        cardDeck.iterable().forEach(System.out::println);

    }
}
