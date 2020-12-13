package leaseacar.service;

import leaseacar.model.Cardata;

import java.util.List;

//Interface to define required methods
public interface CarService {
    Cardata createCar(Cardata cardata);

    Cardata updateCar(Cardata cardata);

    List<Cardata> getAllCars();

    Cardata getCarById(long carId);

    void deleteCar(long id);
}
