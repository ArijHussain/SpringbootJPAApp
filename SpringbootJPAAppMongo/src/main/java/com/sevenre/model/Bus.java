package com.sevenre.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "businfo")
@Getter
@Setter
public class Bus {

    @Id
    private long busId;

    private String imei;

    private String licenseNo;

    private String model;
}
