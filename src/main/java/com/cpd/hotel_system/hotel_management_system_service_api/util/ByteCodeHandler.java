package com.cpd.hotel_system.hotel_management_system_service_api.util;

public class ByteCodeHandler {
    public static byte[] toByteArray(String string) {
        return string.getBytes();
    }

    public static String toString(byte[] byteArray) {
        return new String(byteArray);
    }
}
