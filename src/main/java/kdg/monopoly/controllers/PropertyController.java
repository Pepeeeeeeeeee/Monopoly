package kdg.monopoly.controllers;

import kdg.monopoly.classes.PropertyStorage;
import kdg.monopoly.models.Player;
import kdg.monopoly.models.Property;

public class PropertyController {

    public PropertyStorage propertyStorage = new PropertyStorage();
    public Player player = new Player();

    //TODO: separate buyable and non-buyable properties
    public void buyProperty(int playerPosition){
        Property property = propertyStorage.getCardById(playerPosition);
        if(property.isBuyable() && player.getMoney() >= property.getCardPurchaseValue()){
            buyPropertyWindow();
        }
        //else enemy turn
    }

    //TODO: show buy option window
    public void buyPropertyWindow(){

    }

    public void acceptBuyProperty(int propertyId){
        Property property = propertyStorage.getCardById(propertyId);

        int purchaseValue = property.getCardPurchaseValue();
        int playerMoney = player.getMoney();

        player.setMoney(playerMoney - purchaseValue);
        player.addProperty(propertyId);
    }

    //TODO: close the buy option window
    public void declineBuyProperty() {

    }

    public void sellPropertyToBank(int propertyId){
        Property property = propertyStorage.getCardById(propertyId);
        int price = property.getCardPurchaseValue();
        int playerMoney = player.getMoney();

        player.setMoney(playerMoney + price);
        player.removeProperty(propertyId);

    }
}
