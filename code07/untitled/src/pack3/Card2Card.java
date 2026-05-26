package pack3;

public class Card2Card extends Payment {

    private String cardNumFrom;
    private String cardNumTo;

    public Card2Card(double amount, String cardNumFrom, String cardNumTo) {
        super(amount);
        this.cardNumFrom = cardNumFrom;
        this.cardNumTo = cardNumTo;
    }

    public String getCardNumFrom() {
        return cardNumFrom;
    }

    public void setCardNumFrom(String cardNumFrom) {
        this.cardNumFrom = cardNumFrom;
    }

    public String getCardNumTo() {
        return cardNumTo;
    }

    public void setCardNumTo(String cardNumTo) {
        this.cardNumTo = cardNumTo;
    }

    @Override
    public String toString() {
        return "Card2Card{" +
                "cardNumFrom='" + cardNumFrom + '\'' +
                ", cardNumTo='" + cardNumTo + '\'' +
                "} " + super.toString();
    }
}
