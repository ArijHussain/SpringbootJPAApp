package com.sevenre.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;


@Document(collection="users")
@Getter
@Setter
public class User {

    @Id
    private long userId;

    private String name;

    private int age;

    private Address address;



}
