package com.cpd.hotel_system.hotel_management_system_service_api.service.impl;

import com.cpd.hotel_system.hotel_management_system_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_system_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_system_service_api.dto.response.paginate.RoomImagePaginateDto;
import com.cpd.hotel_system.hotel_management_system_service_api.service.RoomImageService;
import org.springframework.stereotype.Service;

@Service
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomImageDto dto) {

    }

    @Override
    public void update(RequestRoomImageDto dto, String roomImageId) {

    }

    @Override
    public void delete(String roomImageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String roomImageId) {
        return null;
    }

    @Override
    public RoomImagePaginateDto findAll(int page, int size, String roomId) {
        return null;
    }
}
