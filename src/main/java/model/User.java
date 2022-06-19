package model;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
//implements Principal
public class User  {
    private static List<User> allUsers;

    static {
        allUsers = new ArrayList<>();
        allUsers.add(new User("k","k", "admin"));
    }

    private String name;
    private String wachtwoord;
    private String role;

public User(String name, String wachtwoord,  String role ) {
    this.name = name;
    this.wachtwoord = wachtwoord;
    this.role = role;

}
    public static String validateLogin(String username, String password){
        for (User user : allUsers) {
            if(user.name.equals(username) && user.wachtwoord.equals(password)){
                return user.role;
            }
        }
        return null;
    }


    public static User getUserByName(String name){
        for (User user : allUsers){
            if(user.name.equals(name)){
                return user;
            }
        }
        return null;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }
}








