package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

/**
 * class that contains an ArrayList of cards as player's "hand", also variable for total hand value
 */
public class Hand {
    private ArrayList<Card> cards;
    private int handValue;

    public Hand() {
        this.cards = new ArrayList<>();
        this.getHandValue();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    /**
     * method that returns total value of player's hand
     * @return
     */
    public int getHandValue() {
        this.handValue = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            this.handValue += this.cards.get(i).getCardValue();
        }

        return this.handValue;
    }

    /**
     * method that checks if a player has busted
     * @return
     */
    public boolean overTwentyOne() {
        return this.handValue > 21;
    }

    /**
     * method that clears hand after round
     */
    public void clearHand(){
            this.cards.clear();
    }

    @Override
    public String toString() {
        return this.cards +
                ", Hand Value = " + this.handValue;
    }
}
