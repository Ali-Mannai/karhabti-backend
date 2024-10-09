package com.example.karhabti.karhabtiApp.Models;


import com.example.karhabti.karhabtiApp.enums.Type;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;
    private double pricePerDay;
    private String model;
    @Enumerated(EnumType.STRING)
    private Type type;

    private String year;
    private boolean available;
    private String color;
    private Date startDate;
    private Date endDate;
}
