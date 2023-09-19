package com.example.LiftManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lift")
public class LiftController {
    @Autowired
    LiftService liftService;

    @PostMapping("/add-passenger")
    public String addPassenger(@RequestBody Passenger passenger){
        return liftService.addPassenger(passenger);
    }

    @PutMapping("/add-lift")
    public String addLift(@RequestBody Lift lift){
        return liftService.addLift(lift);
    }

    @DeleteMapping("/delete-passengers")
    public String deletePassengers(){
        return liftService.deletePassengers();
    }

    @GetMapping("/passengers-more-than-50")
    public int weightGreaterThan50(@RequestParam Lift lift){
        return liftService.weightGreaterThan50(lift);
    }

    @GetMapping("/maximum-passengers")
    public int maximumPassengers(@RequestParam int weight){
        return liftService.maximumPassengers(weight);
    }
}
