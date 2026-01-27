package com.example.facilitybookingbackend.repository;

import com.example.facilitybookingbackend.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    // Student: view only their bookings
    List<Booking> findByUserName(String userName);

    // Admin: view bookings by status (optional use later)
    List<Booking> findByStatus(String status);
}
