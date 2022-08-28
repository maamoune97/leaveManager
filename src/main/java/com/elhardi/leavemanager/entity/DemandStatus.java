package com.elhardi.leavemanager.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.GenerationType;
@Entity()
@Data
public class DemandStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
