package kdg.monopoly.managers;

import kdg.monopoly.models.User;

import java.util.Objects;

public class auth {
    private String hashPasswordDB;
    private String hashPasswordInput;
    User user = new User();

    public String getHashPasswordDB() {
        return hashPasswordDB;
    }

    public void setHashPasswordDB(String hashPasswordDB) {
        this.hashPasswordDB = hashPasswordDB;
    }

    public String getHashPasswordInput() {
        return hashPasswordInput;
    }

    public void setHashPasswordInput(String hashPasswordInput) {
        this.hashPasswordInput = user.getPassword();
    }

    public boolean auth(){
        return Objects.equals(hashPasswordDB, hashPasswordInput);
    }
}
