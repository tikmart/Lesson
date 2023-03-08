package oop.collections.exercise;

import java.util.HashMap;
import java.util.Map;

public class UserLogin {
    public static void main(String[] args) {


        try {
            login(new User( "Tigran", "tigran.martirosyan@gmail.com", "oasndalsdn"));
        } catch (MyException e) {
            e.printStackTrace();
        }

    }


    static User login(User u) throws MyException {
        Map<String, String > users =  Login.generateMap();

        for (Map.Entry<String, String> entry : users.entrySet()) {
            if (entry.getKey().equals(u.getEmail()) && entry.getValue().equals(u.getPassword())) {
                System.out.println("successful login");
                return u;
            } else if ((!entry.getKey().equals(u.getEmail())) && entry.getValue().equals(u.getPassword())) {
                throw new MyException("username is incorrect");
            } else if (entry.getKey().equals(u.getEmail()) && (!entry.getValue().equals(u.getPassword()))) {
                throw new MyException("password is incorrect");

            } else {
                throw new MyException("username and password is incorrect");
            }
        }


        return null;
    }
}
