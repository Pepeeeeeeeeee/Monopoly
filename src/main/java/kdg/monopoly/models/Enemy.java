package kdg.monopoly.models;

import java.util.HashMap;
import java.util.List;

public class Enemy {

    private int money;
    private List<Integer> properties;
    private HashMap<Integer, Integer> houses;
    private int jailFreeCard;
    private int currentPosition;

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void setJailFreeCard(int jailFreeCard){
        this.jailFreeCard = jailFreeCard;
    }

    public int getJailFreeCard(){
        return jailFreeCard;
    }

    public void setCurrentPosition(int currentPosition){
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition(){
        return currentPosition;
    }

    public void addProperty(int propertyId){
        properties.add(propertyId);
    }

    public List<Integer> getPlayerProperties(){
        return properties;
    }

    public Integer getPlayerProperty(int propertyId){
        Integer returnValue = 0;
        for(int i : properties){
            if(properties.get(i) == propertyId){
                returnValue = properties.get(i);
                break;
            }
        }
        return returnValue;
    }

    public void removeProperty(int propertyId) {
        for (int i : properties) {
            if (properties.get(i) == propertyId) {
                properties.remove(i);
            }
        }
    }
}
