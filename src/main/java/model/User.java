package model;


import javax.security.auth.Subject;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements NameObjectUser, Principal {
    private String name;
    private String pass;
    private String role;


    public User(){}
    public User(String name){ this.name = name;}

    public User(String name, String pass, String role){
        this.name = name;
        this.pass = pass;
        if(!role.equals("lid") && !role.equals("medewerker") &&!role.equals("manager")){
            this.role = "lid";
        }
        else{
        this.role = role;}
        allUsers.add(this);
    }


    public static List<User> allUsers = new ArrayList<>();

    public static List<User> onlineAllUsers = new ArrayList<>();

    public static List<User> getdit() {
        return onlineAllUsers;
    }

    public static List<User> onlineMedewerker = new ArrayList<>();

    public static List<User> getDitMedewerker() {
        return onlineMedewerker;
    }


    public static List<User> getAllUser() {

        return Collections.unmodifiableList(allUsers);
    }

    private static User aanWezig = new User();

    public static User getGAanwezig() {
        return aanWezig;
    }

    public static void setAanWezig(User user) {
        aanWezig = user;
    }

    private static User deUser = new User();

    public static User getUser() {
        return deUser;
    }




//    public static List<User> getAllUsers() {
//        return Collections.unmodifiableList(allUsers);
//    }

    public static String validateLogin(String name, String pass){
        for (User user : allUsers) {
            if(user.name.equals(name) && user.pass.equals(pass)){
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

//    public static boolean getGeheleUserVerwijder(String name, String pass , String role){
//        boolean d = false;
//        for (User user : allUsers){
//            if(user.name.equals(name) && user.pass.equals(pass) &&user.role.equals(role)){
//                if(allUsers.contains(user)){
//                    allUsers.remove(user);
//                   d =  true;}
//
//        }
//
//    }return d ;}

    public static boolean getGeheleUser(String name, String pass , String role){
        User s = new User(name,pass,role);
        boolean d = false;
        for (User user : allUsers){
            if(user.getName().equals(s.getName()) && user.getPass().equals(s.getPass()) &&user.getRole().equals(s.getRole())){
                if(allUsers.contains(user)){
                    allUsers.remove(user);
                    d = true;}

            }
        }return d;
        }


    public static boolean verwijderUser(User g){
        boolean fout = false;
        if(allUsers.contains(g)){
            allUsers.remove(g);
            fout = true;
        } return  fout;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean implies(Subject subject) {
        return Principal.super.implies(subject);
    }

    public String getRole(){
        return role;
    }

    public String getPass() {
        return pass;
    }
}
