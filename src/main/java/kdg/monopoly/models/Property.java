package kdg.monopoly.models;

public class Property {
    /*
    card id => int (PK)
    card name => varchar(255)
    card purchase value => int
    card set id => int
    card rent => int
    card rent set => int
    card rent 1house => int
    card rent 2house => int
    card rent 3house => int
    card rent 4house => int
    card rent hotel => int
    card house cost => int
    card hotel cost => int
    card mortgage value => int
*/

    private int cardId;
    private String cardName;
    private int cardPurchaseValue;
    private int cardSetId;
    private int cardRent;
    private int cardRentSet;
    private int cardRent1House;
    private int cardRent2House;
    private int cardRent3House;
    private int cardRent4House;
    private int cardRentHotel;
    private int cardHouseCost;
    private int cardHotelCost;
    private int cardMortgageValue;
    private boolean buyable;
    private boolean available;

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardName='" + cardName +
                ", cardPurchaseValue=" + cardPurchaseValue +
                ", cardSetId=" + cardSetId +
                ", cardRent=" + cardRent +
                ", cardRentSet=" + cardRentSet +
                ", cardRent1House=" + cardRent1House +
                ", cardRent2House=" + cardRent2House +
                ", cardRent3House=" + cardRent3House +
                ", cardRent4House=" + cardRent4House +
                ", cardRentHotel=" + cardRentHotel +
                ", cardHouseCost=" + cardHouseCost +
                ", cardHotelCost=" + cardHotelCost +
                ", cardMortgageValue=" + cardMortgageValue +
                ", buyable=" + buyable +
                ", available=" + available +
                '}';
    }

    public Property(int cardId, String cardName, int cardPurchaseValue, int cardSetId, int cardRent,
                    int cardRentSet, int cardRent1House, int cardRent2House, int cardRent3House,
                    int cardRent4House, int cardRentHotel, int cardHouseCost, int cardHotelCost,
                    int cardMortgageValue, boolean buyable) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardPurchaseValue = cardPurchaseValue;
        this.cardSetId = cardSetId;
        this.cardRent = cardRent;
        this.cardRentSet = cardRentSet;
        this.cardRent1House = cardRent1House;
        this.cardRent2House = cardRent2House;
        this.cardRent3House = cardRent3House;
        this.cardRent4House = cardRent4House;
        this.cardRentHotel = cardRentHotel;
        this.cardHouseCost = cardHouseCost;
        this.cardHotelCost = cardHotelCost;
        this.cardMortgageValue = cardMortgageValue;
        this.buyable = buyable;
    }

    // Getter and Setter for cardId
    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    // Getter and Setter for cardName
    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    // Getter and Setter for cardPurchaseValue
    public int getCardPurchaseValue() {
        return cardPurchaseValue;
    }

    public void setCardPurchaseValue(int cardPurchaseValue) {
        this.cardPurchaseValue = cardPurchaseValue;
    }

    // Getter and Setter for cardSetId
    public int getCardSetId() {
        return cardSetId;
    }

    public void setCardSetId(int cardSetId) {
        this.cardSetId = cardSetId;
    }

    // Getter and Setter for cardRent
    public int getCardRent() {
        return cardRent;
    }

    public void setCardRent(int cardRent) {
        this.cardRent = cardRent;
    }

    // Getter and Setter for cardRentSet
    public int getCardRentSet() {
        return cardRentSet;
    }

    public void setCardRentSet(int cardRentSet) {
        this.cardRentSet = cardRentSet;
    }

    // Getter and Setter for cardRent1House
    public int getCardRent1House() {
        return cardRent1House;
    }

    public void setCardRent1House(int cardRent1House) {
        this.cardRent1House = cardRent1House;
    }

    // Getter and Setter for cardRent2House
    public int getCardRent2House() {
        return cardRent2House;
    }

    public void setCardRent2House(int cardRent2House) {
        this.cardRent2House = cardRent2House;
    }

    // Getter and Setter for cardRent3House
    public int getCardRent3House() {
        return cardRent3House;
    }

    public void setCardRent3House(int cardRent3House) {
        this.cardRent3House = cardRent3House;
    }

    // Getter and Setter for cardRent4House
    public int getCardRent4House() {
        return cardRent4House;
    }

    public void setCardRent4House(int cardRent4House) {
        this.cardRent4House = cardRent4House;
    }

    // Getter and Setter for cardRentHotel
    public int getCardRentHotel() {
        return cardRentHotel;
    }

    public void setCardRentHotel(int cardRentHotel) {
        this.cardRentHotel = cardRentHotel;
    }

    // Getter and Setter for cardHouseCost
    public int getCardHouseCost() {
        return cardHouseCost;
    }

    public void setCardHouseCost(int cardHouseCost) {
        this.cardHouseCost = cardHouseCost;
    }

    // Getter and Setter for cardHotelCost
    public int getCardHotelCost() {
        return cardHotelCost;
    }

    public void setCardHotelCost(int cardHotelCost) {
        this.cardHotelCost = cardHotelCost;
    }

    // Getter and Setter for cardMortgageValue
    public int getCardMortgageValue() {
        return cardMortgageValue;
    }

    public void setCardMortgageValue(int cardMortgageValue) {
        this.cardMortgageValue = cardMortgageValue;
    }

    // Getter and Setter for buyable
    public boolean isBuyable() {
        return buyable;
    }

    public void setBuyable(boolean buyable) {
        this.buyable = buyable;
    }

    // Getter and Setter for available
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
