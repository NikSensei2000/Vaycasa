package com.niksensei.projects.vaycasa.repository;

import com.niksensei.projects.vaycasa.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}