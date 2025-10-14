package com.cpd.hotel_system.hotel_management_system_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false, name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
