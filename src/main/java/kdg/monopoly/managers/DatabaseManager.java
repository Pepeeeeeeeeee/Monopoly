package kdg.monopoly.managers;

import kdg.monopoly.models.Property;
import kdg.monopoly.models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;

import static java.lang.String.format;

public class DatabaseManager {
    private final String connectionUrl = "jdbc:postgresql://localhost:5432/Monopoly?user=postgres&password=Student_1234";
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    Property property;
    PropertyStorage propertyStorage;
    User user;

    public void test(){
        try {
            con = DriverManager.getConnection(connectionUrl);
            String SQL = "SELECT * FROM users";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getProperties(){
        try {
            con = DriverManager.getConnection(connectionUrl);
            String SQL = "SELECT * FROM properties";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                property.setCardId(rs.getInt(1));
                property.setCardName(rs.getString(2));
                property.setCardPurchaseValue(rs.getInt(3));
                property.setCardSetId(rs.getInt(4));
                property.setCardRent(rs.getInt(5));
                property.setCardRentSet(rs.getInt(6));
                property.setCardRent1House(rs.getInt(7));
                property.setCardRent2House(rs.getInt(8));
                property.setCardRent3House(rs.getInt(9));
                property.setCardRent4House(rs.getInt(10));
                property.setCardRentHotel(rs.getInt(11));
                property.setCardHouseCost(rs.getInt(12));
                property.setCardHotelCost(rs.getInt(13));
                property.setCardMortgageValue(rs.getInt(14));
                property.setBuyable(Boolean.parseBoolean(rs.getString(15)));
                property.setAvailable(Boolean.parseBoolean(rs.getString(16)));

                propertyStorage.addCard(property);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
//
//    public void userAuth(){
//        try {
//            String pass = user.getPassword();
//            con = DriverManager.getConnection(connectionUrl);
//            String SQL = format("SELECT * FROM users WHERE uPassword = '{%s}'", pass);
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(SQL);
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + " " + rs.getString(2));
//            }
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
