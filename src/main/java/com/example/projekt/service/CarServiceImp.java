package com.example.projekt.service;

import com.example.projekt.model.Car;
import com.example.projekt.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService {

    private CarRepository carRepository;

    public CarServiceImp(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCarById(long id) {
        Optional<Car> car = carRepository.findById(id);
        if(car.isPresent()) {
            carRepository.delete(car.get());
        }
    }

    @Override
    public void saveCar(Car car) {
        carRepository.save(car);
    }

}
