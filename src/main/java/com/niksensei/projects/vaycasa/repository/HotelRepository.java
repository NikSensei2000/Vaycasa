package com.niksensei.projects.vaycasa.repository;

import com.niksensei.projects.vaycasa.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
