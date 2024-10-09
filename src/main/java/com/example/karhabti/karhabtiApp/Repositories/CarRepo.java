package com.example.karhabti.karhabtiApp.Repositories;

import com.example.karhabti.karhabtiApp.Models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<CarModel,Long> {

}
