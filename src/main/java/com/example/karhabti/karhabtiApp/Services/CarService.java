package com.example.karhabti.karhabtiApp.Services;


import com.example.karhabti.karhabtiApp.Models.CarModel;
import com.example.karhabti.karhabtiApp.Repositories.CarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class CarService {

    private final CarRepo carRepository;


    public List<CarModel> getAllCars(){
        List<CarModel> listOfCars;
        listOfCars = carRepository.findAll();
        return listOfCars;
    }
    public CarModel createCar(CarModel carModel){
        return carRepository.save(carModel);
    }
    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }

    public Optional<CarModel> getById(Long id){
        return carRepository.findById(id);
    }

    public CarModel updateCar(Long id, CarModel updatedCar) {
        CarModel existingCar = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));


        existingCar.setModel(updatedCar.getModel());
        existingCar.setYear(updatedCar.getYear());
        existingCar.setType(updatedCar.getType());
        existingCar.setPricePerDay(updatedCar.getPricePerDay());
        existingCar.setAvailable(updatedCar.isAvailable());

        return carRepository.save(existingCar);
    }



}
