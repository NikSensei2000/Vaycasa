package com.niksensei.projects.vaycasa.service;

import com.niksensei.projects.vaycasa.dto.BookingDto;
import com.niksensei.projects.vaycasa.dto.BookingRequest;
import com.niksensei.projects.vaycasa.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
