package kdg.monopoly.models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Function;

public class User {
    private int id;
    private String uName;
    private String password;
    private boolean isLoggedIn;

    public int getId(){
        return id;
    }

    public void setUname(String uName){
        this.uName = uName;
    }

    public String getUname(){
        return uName;
    }

    public void setPassword(String password) {
        this.password = hashPasswd(password);
    }

    public String getPassword(){
        return password;
    }

    private void setLoggedIn(boolean loggedIn){
        this.isLoggedIn = loggedIn;
    }

    public boolean getLoggedIn(){
        return isLoggedIn;
    }

    private String hashPasswd(String password) {
        String stringHash = null;
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(password.getBytes());
            stringHash = new String(messageDigest.digest());
        }
        catch (NoSuchAlgorithmException e){
            System.err.println(e.getMessage());
        }
        return stringHash == null ? "" : stringHash;
    }
}
