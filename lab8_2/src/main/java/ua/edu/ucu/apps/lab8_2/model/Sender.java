package ua.edu.ucu.apps.lab8_2.model;

public class Sender implements User {
    @Override
    public void update(String status) {
        System.out.println("Sender update: " + status);
    }
}
