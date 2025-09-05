package com.org.TripAPI.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users") // avoid reserved word conflict with SQL
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String account;

    @Column(name = "display_name", length = 20)
    private String displayName;

    private String email;

}
