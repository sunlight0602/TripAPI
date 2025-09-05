package com.org.TripAPI.dto;

import lombok.Data;

@Data
public class CreateTripRequest {
    private String destination;
    private String startDate; // 這裡可以用 String, 再轉成 OffsetDateTime
    private String endDate;
}
