package com.example.LiftManagementSystem;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository

public class LiftRepository {
    HashMap<Integer,Passenger> passengerHashMap = new HashMap<>();
    HashMap<Integer,Lift> liftHashMap = new HashMap<>();
    public  String addPassenger(Passenger passenger) {
        passengerHashMap.put(passenger.getPassengerId(),passenger);
        return "Success";
    }

    public  String addLift(Lift lift) {
        liftHashMap.put(lift.getLiftNo(),lift);
        return "Success";
    }

    public  String deletePassengers() {
        for(int id : passengerHashMap.keySet()){
            if(id<5){
                passengerHashMap.remove(id);
            }
        }
        return "Success";
    }

    public  int weightGreaterThan50(Lift lift) {
        int count=0;
        List<Passenger> passengerArrayList = lift.getList();
        for(Passenger passenger : passengerArrayList){
            int wt = passenger.getWeight();
            if(wt>50){
                count++;
            }
        }
        return count;
    }

    public  int maximumPassengers(int weight) {
        int count=0;
        for(Lift lift : liftHashMap.values()){
            for(Passenger passenger : lift.getList()){
                if(passenger.getWeight()<weight && lift.getCapacityInPerson()>0){
                    count++;
                    lift.setCapacityInPerson(-1);
                    weight=weight-passenger.getWeight();
                }
            }
        }
        return count;
    }
}
