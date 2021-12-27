package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * class containing an Array of "Cards", and ArrayList of used "Cards"
 */
public class Deck {

    private Card[] cards;
    private ArrayList<Integer> usedCards;

    public Deck() {
        setDeck();
        this.usedCards = new ArrayList<>();
    }

    /**
     * method that populates the deck before the cards are dealt
     */
    public void setDeck() {
        this.cards = new Card[52];
        for (int i = 0; i < 13; i++) {
            this.cards[i] = new Card(0, i);
            this.cards[i + 13] = new Card(1, i);
            this.cards[i + 26] = new Card(2, i);
            this.cards[i + 39] = new Card(3, i);
        }
    }

    /**
     * method that randomly deals each player a card from the deck
     * @param player
     */
    public void dealCard(Player player) {
        int min = 0;
        int max = 51;
        int a = (int) (Math.random() * (max - min + 1) + min);
        while (usedCards.contains(a)) {
            a = (int) (Math.random() * (max - min + 1) + min);
        }
        player.addCard(cards[a]);

        usedCards.add(a);

    }

    /**
     * method that clears used card pile, to get ready for next round
     */
    public void replenishDeck(){
        this.usedCards.clear();
    }

    @Override
    public String toString() {
        return "Full deck of cards includes...." +
                Arrays.toString(cards);
    }
}