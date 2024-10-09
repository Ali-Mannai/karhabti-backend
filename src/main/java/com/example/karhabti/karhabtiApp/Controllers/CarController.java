package com.example.karhabti.karhabtiApp.Controllers;


import com.example.karhabti.karhabtiApp.Models.CarModel;
import com.example.karhabti.karhabtiApp.Services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/car")
public class CarController {

    private final CarService carService;


    @GetMapping
    public List<CarModel> getAllCars(){
        return carService.getAllCars();
    }



    @PostMapping
    public ResponseEntity<CarModel> createCar(@RequestBody CarModel car) {
        CarModel savedCar = carService.createCar(car);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id){
        carService.deleteCar(id);
        return "car deleted";
    }











}
