package com.org.TripAPI.controller;

import com.org.TripAPI.dto.CreateTripRequest;
import com.org.TripAPI.dto.CreateTripResponse;
import com.org.TripAPI.service.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TripController {

    private final TripService tripService;

    @PostMapping("/trip")
    public CreateTripResponse createTrip(@RequestBody CreateTripRequest createTripRequest) {
        return tripService.createTrip(createTripRequest);
    }
}
