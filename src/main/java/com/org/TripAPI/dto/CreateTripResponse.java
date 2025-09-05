package com.org.TripAPI.dto;

import lombok.Data;

@Data
public class CreateTripResponse {
    private Long id;
    private String destination;
    private String startDate;
    private String endDate;
}
