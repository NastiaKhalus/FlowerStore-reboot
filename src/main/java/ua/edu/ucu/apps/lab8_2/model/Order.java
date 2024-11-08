package ua.edu.ucu.apps.lab8_2.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update("Notified users");
        }
    }

    public void order() {
        notifyUsers();
    }
}