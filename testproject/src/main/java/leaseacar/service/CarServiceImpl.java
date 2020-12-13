package leaseacar.service;

import leaseacar.exception.ResourceNotFoundException;
import leaseacar.model.Cardata;
import leaseacar.repository.CardataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

//Implementaton of methods
@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CardataRepository cardataRepository;


    @Override
    public Cardata createCar(Cardata cardata) {
        return cardataRepository.save(cardata);
    }

    @Override
    public Cardata updateCar(Cardata cardata) {
        Optional< Cardata > cardataDb = this.cardataRepository.findById(cardata.getId());

        if (cardataDb.isPresent()) {
            Cardata cardataUpdate = cardataDb.get();
            cardataUpdate.setId(cardata.getId());
//            cardataUpdate.setName(cardata.getName());
//            cardataUpdate.setDescription(cardata.getDescription());
            cardataRepository.save(cardataUpdate);
            return cardataUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + cardata.getId());
        }
    }

    @Override
    public List<Cardata> getAllCars() {
        return this.cardataRepository.findAll();
    }

    @Override
    public Cardata getCarById(long carId) {
        Optional < Cardata > cardataDb = this.cardataRepository.findById(carId);

        if (cardataDb.isPresent()) {
            return cardataDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + carId);
        }
    }

    @Override
    public void deleteCar(long carId) {
        Optional < Cardata > carDb = this.cardataRepository.findById(carId);

        if (carDb.isPresent()) {
            this.cardataRepository.delete(carDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + carId);
        }
    }
}
