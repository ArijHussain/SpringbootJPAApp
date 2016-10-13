package com.sevenre.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trace")
@Getter
@Setter
public class Trace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double latitude;

    private double longitude;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:mm", timezone = "CET")
    private Date time;

    private double speed;
}
