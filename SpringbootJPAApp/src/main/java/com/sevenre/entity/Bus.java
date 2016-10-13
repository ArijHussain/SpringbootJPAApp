package com.sevenre.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "businfo")
@Getter
@Setter
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long busId;

    private String imei;

    private String licenseNo;

    private String model;
}
