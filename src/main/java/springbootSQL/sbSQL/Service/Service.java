package springbootSQL.sbSQL.Service;

import springbootSQL.sbSQL.Entity.Car;

import java.util.List;
import java.util.Optional;

public interface Service {

    List<Car> getAllCars();

    Optional<Car> getCarById(int id);

    Car saveCar(Car car);

    void deleteCar(int id);
}
