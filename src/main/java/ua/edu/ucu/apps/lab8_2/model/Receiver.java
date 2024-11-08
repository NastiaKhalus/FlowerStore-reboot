package ua.edu.ucu.apps.lab8_2.model;

public class Receiver implements User {
    @Override
    public void update(String status) {
        System.out.println("Reciever update: " + status);
    }
}