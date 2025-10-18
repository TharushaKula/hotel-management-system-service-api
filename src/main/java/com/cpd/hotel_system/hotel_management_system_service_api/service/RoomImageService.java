package com.cpd.hotel_system.hotel_management_system_service_api.service;

import com.cpd.hotel_system.hotel_management_system_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.hotel_management_system_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_system_service_api.dto.response.paginate.RoomImagePaginateDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto dto);
    public void update(RequestRoomImageDto dto, String roomImageId);
    public void delete(String roomImageId);
    public ResponseRoomImageDto findById(String roomImageId);
    public RoomImagePaginateDto findAll(int page, int size, String roomId);
}
