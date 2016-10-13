package com.sevenre.controller;

import com.sevenre.entity.Trip;
import com.sevenre.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ws/trips")
public class TripController {

    private TripRepository tripRepository;

    @Autowired
    public TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    /**
     * Return all trips
     */
    @RequestMapping( method = RequestMethod.GET)
    public List<Trip> getAllTrips(){
        return tripRepository.findAll();

    }


    /**
     * Save the trips
     */
    @RequestMapping( method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addTrips(@RequestBody List<Trip> trips){

        for(Trip trip:trips) {
            tripRepository.save(trip);
        }
        return "Trip created successfully!";

    }
}
