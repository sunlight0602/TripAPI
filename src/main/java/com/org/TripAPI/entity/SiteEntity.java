package com.org.TripAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "site")
public class SiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
