package com.example.LiftManagementSystem;

public class Passenger {

    private int passengerId;
    private int weight;

    public Passenger() {
    }

    public Passenger(int passengerId, int weight) {
        this.passengerId = passengerId;
        this.weight = weight;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
