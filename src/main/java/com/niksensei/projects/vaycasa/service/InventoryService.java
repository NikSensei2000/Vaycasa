package com.niksensei.projects.vaycasa.service;

import com.niksensei.projects.vaycasa.dto.HotelPriceDto;
import com.niksensei.projects.vaycasa.dto.HotelSearchRequest;
import com.niksensei.projects.vaycasa.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
