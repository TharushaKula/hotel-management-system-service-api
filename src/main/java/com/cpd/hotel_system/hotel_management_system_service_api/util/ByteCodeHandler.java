package com.cpd.hotel_system.hotel_management_system_service_api.util;

import java.sql.Blob;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.stereotype.Service;

@Service
public class ByteCodeHandler {
    public Blob stringToBlob(String data) throws SQLException {
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        return new SerialBlob(bytes);
    }
}
