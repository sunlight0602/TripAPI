package com.org.TripAPI.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users_trip")
public class UserTripEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    int score;

    @Column(length = 100)
    String comment;

    @OneToMany
    private UserEntity user;

    @OneToMany
    private TripEntity trip;

    @OneToMany(mappedBy = "userTrip", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PhotoEntity> photos;
}
