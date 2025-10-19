package com.cpd.hotel_system.hotel_management_system_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_system_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_system_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_system_service_api.dto.response.paginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.hotel_management_system_service_api.entity.Hotel;
import com.cpd.hotel_system.hotel_management_system_service_api.service.HotelService;
import com.cpd.hotel_system.hotel_management_system_service_api.util.ByteCodeHandler;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.RequiredArgsConstructor;

import com.cpd.hotel_system.hotel_management_system_service_api.repo.HotelRepo;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;

    @Override
    public void create(RequestHotelDto dto) {


    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return dto==null?null:
        Hotel.builder()
        .hotelName(dto.getHotelName())
        .hotel_id(UUID.randomUUID().toString())
        .starRating(dto.getStarRating())
        .description(byteCodeHandler.stringToBlob(dto.getDescription()))
        .createdAt(LocalDateTime.now())
        .updatedAt(LocalDateTime.now())
        .activeStatus(true)
        .startingFrom(dto.getStartingFrom())
        .build();
    }
}
