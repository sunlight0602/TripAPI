package com.org.TripAPI.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "trip")
public class TripEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;

    @OneToMany
    List<SiteEntity> sites;
}
