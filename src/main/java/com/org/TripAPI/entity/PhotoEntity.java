package com.org.TripAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "photo")
public class PhotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url; // 照片的路徑或存檔位置

    @ManyToOne
    @JoinColumn(name = "user_trip_id", nullable = false)
    private UserTripEntity userTrip;
}
