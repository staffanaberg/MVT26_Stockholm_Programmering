package exercise04;

import java.util.Objects;

public class User {

    private String userName;
    private String password;
    private String typeOfUser;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.typeOfUser = "normal";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String newUserName) {
        if (newUserName.length() >= 4) {
            this.userName = newUserName;
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 7 && newPassword.length() <= 20) {
            this.password = newPassword;
        }
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String newTypeOfUser) {
        if(newTypeOfUser.equals("normal") || newTypeOfUser.equals("admin") || newTypeOfUser.equals("super")) {
            this.typeOfUser = newTypeOfUser;
        }
    }
}
