package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    public String getName() {
        return this.name;
    }

    public Hand getHand() {
        return this.hand;
    }

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

