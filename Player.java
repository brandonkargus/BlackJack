package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/**
 * class that holds a player's name, hand, and pot
 */
public class Player {
    private String name;
    private Hand hand;
    private int potValue;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return this.name;
    }

    public Hand getHand() {
        return this.hand;
    }

    /**
     * method that adds a card to the player's hand, and calls getHandValue() for hand value
     * @param card
     */
    public void addCard(Card card) {

        this.hand.addCard(card);
        this.hand.getHandValue();

    }

    public int getPotValue() {
        return this.potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    /**
     * method that checks if the A.I. will "hit" or "stand", based on hand value
     * @return
     */
    public boolean computerAI() {
        return this.hand.getHandValue() < 16;
    }

    @Override
    public String toString() {
        return this.name +
                ": " + this.hand +
                ", Pot Value = " + this.potValue;

    }
}

