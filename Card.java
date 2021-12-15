package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private int suit;
    private int cardValue;


    public Card(int suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        if (this.cardValue > 9) {
            return 10;
        } else {
            return this.cardValue + 1;
        }

    }

    public char showSuit(int suit) {
        switch (suit) {
            case 0:
                return '♠';
            case 1:
                return '♦';
            case 2:
                return '♥';
            default:
                return '♣';
        }
    }

    public String showCard(int num) {
        switch (num) {
            case 0:
                return "A";
            case 1:
                return "2";
            case 2:
                return "3";
            case 3:
                return "4";
            case 4:
                return "5";
            case 5:
                return "6";
            case 6:
                return "7";
            case 7:
                return "8";
            case 8:
                return "9";
            case 9:
                return "10";
            case 10:
                return "J";
            case 11:
                return "Q";
            default:
                return "K";
        }
    }

    @Override
    public String toString() {
        return "" + showCard(cardValue) + showSuit(suit);
    }
}
