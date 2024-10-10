package kdg.monopoly.classes;

import kdg.monopoly.models.Property;
import java.util.HashMap;
import java.util.Map;

public class PropertyStorage {
    private Map<Integer, Property> propertiesMap = new HashMap<>();

    public void addCard(Property property) {
        propertiesMap.put(property.getCardId(), property);
    }

    public Property getCardById(int cardId) {
        return propertiesMap.get(cardId);
    }

    public void populateStorage(){
        //get from db and addCard()
    }
}
