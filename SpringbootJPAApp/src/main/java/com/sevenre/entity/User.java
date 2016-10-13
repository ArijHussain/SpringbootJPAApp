package com.sevenre.entity;

import com.sevenre.repository.AddressRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String name;

    private int age;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;


}
