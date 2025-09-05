package com.org.TripAPI.service;

import com.org.TripAPI.dto.CreateTripRequest;
import com.org.TripAPI.dto.CreateTripResponse;
import com.org.TripAPI.entity.TripEntity;
import com.org.TripAPI.repository.TripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class TripService {
    private final TripRepository tripRepository;

    public CreateTripResponse createTrip(CreateTripRequest request) {
        TripEntity tripEntity = new TripEntity();
        tripEntity.setDestination(request.getDestination());
        tripEntity.setStartDate(OffsetDateTime.parse(request.getStartDate(), DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        tripEntity.setEndDate(OffsetDateTime.parse(request.getEndDate(), DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        TripEntity saved = tripRepository.save(tripEntity);

        CreateTripResponse response = new CreateTripResponse();
        response.setId(saved.getId());
        response.setDestination(saved.getDestination());
        response.setStartDate(saved.getStartDate().toString());
        response.setEndDate(saved.getEndDate().toString());
        return response;
    }
}
