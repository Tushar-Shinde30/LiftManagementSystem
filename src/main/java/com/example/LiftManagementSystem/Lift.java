package com.example.LiftManagementSystem;

import java.util.List;

public class Lift {
    private  int liftNo;
    private  int capacityInWeight;
    private int capacityInPerson;
    private List<Passenger> list;

    public Lift() {
    }

    public Lift(int liftNo, int capacityInWeight, int capacityInPerson) {
        this.liftNo = liftNo;
        this.capacityInWeight = capacityInWeight;
        this.capacityInPerson = capacityInPerson;
        this.list = list;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacityInWeight() {
        return capacityInWeight;
    }

    public void setCapacityInWeight(int capacityInWeight) {
        this.capacityInWeight = capacityInWeight;
    }

    public int getCapacityInPerson() {
        return capacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        this.capacityInPerson = capacityInPerson;
    }
    public List<Passenger> getList() {
        return list;
    }

    public void setList(List<Passenger> list) {
        this.list = list;
    }
}
