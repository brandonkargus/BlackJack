package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {

    private Card[] cards;
    private ArrayList<Integer> usedCards;

    public Deck() {
        setDeck();
        this.usedCards = new ArrayList<>();
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public void setDeck() {
        this.cards = new Card[52];
        for (int i = 0; i < 13; i++) {
            this.cards[i] = new Card(0, i);
            this.cards[i + 13] = new Card(1, i);
            this.cards[i + 26] = new Card(2, i);
            this.cards[i + 39] = new Card(3, i);
        }
    }

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
    public void replenishDeck(){
        this.usedCards.clear();
    }

    @Override
    public String toString() {
        return "Full deck of cards includes...." +
                Arrays.toString(cards);
    }
}