package kdg.monopoly.models;

public class User {
    private int id;
    private String uName;
    private String password;
    private boolean isLoggedIn;

    public int getId(){
        return id;
    }

    private void setUname(String uName){
        this.uName = uName;
    }

    public String getUname(){
        return uName;
    }

    private void setPassword(String password){
        this.password = password;
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
}
