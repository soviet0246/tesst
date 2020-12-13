package leaseacar.controller;

import leaseacar.model.Cardata;
import leaseacar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Rest stuff
@RestController
public class CardataController {

    @Autowired
    private CarService carService;

    @GetMapping("/cardatas")
    public ResponseEntity<List<Cardata>> getAllCardata(){
        return ResponseEntity.ok().body(carService.getAllCars());
    }

    @GetMapping("/cardatas/{id}")
    public ResponseEntity<Cardata> getCardataById(@PathVariable long carId){
        return ResponseEntity.ok().body(carService.getCarById(carId));
    }

    @PostMapping("/cardatas")
    public ResponseEntity<Cardata> createCardata(@RequestBody Cardata cardata){
        return ResponseEntity.ok().body(this.carService.createCar(cardata));
    }

    @PutMapping("/cardatas/{id}")
    public ResponseEntity<Cardata> updateCardata(@PathVariable long id, @RequestBody Cardata cardata){
        cardata.setId(id);
        return ResponseEntity.ok().body(this.carService.updateCar(cardata));
    }

    @DeleteMapping("/cardatas/{id}")
    public HttpStatus deleteCardata(@PathVariable long carId){
        this.carService.deleteCar(carId);
        return HttpStatus.OK;
    }
}
