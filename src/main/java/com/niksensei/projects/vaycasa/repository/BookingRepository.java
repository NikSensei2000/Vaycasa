package com.niksensei.projects.vaycasa.repository;

import com.niksensei.projects.vaycasa.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
