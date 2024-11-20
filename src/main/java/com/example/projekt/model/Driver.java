package com.example.projekt.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String name;

    @Min(value = 18)
    @Max(value = 100)
    private int age;

    @Min(value = 20000)
    private int salary;

//    @OneToOne
//    private Car car;

//    @ManyToMany
//    @JoinTable(name = "driver_car",
//                joinColumns = @JoinColumn(name = "driver_id"),
//                inverseJoinColumns = @JoinColumn(name = "car_id"))
//    private List<Car> cars;

    @OneToMany(mappedBy = "driver")
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
