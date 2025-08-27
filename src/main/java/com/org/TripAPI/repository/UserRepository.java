package com.org.TripAPI.repository;

import com.org.TripAPI.entity.TripEntity;
import com.org.TripAPI.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
