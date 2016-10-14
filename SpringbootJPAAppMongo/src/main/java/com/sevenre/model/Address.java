package com.sevenre.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
public class Address {

    private String street;

    private String city;

    private String zip;


}
