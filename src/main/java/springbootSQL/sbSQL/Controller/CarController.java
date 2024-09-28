package springbootSQL.sbSQL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springbootSQL.sbSQL.Entity.Car;
import springbootSQL.sbSQL.Service.CarService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Optional<Car> getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/cars")
    public Car putCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
    }
}
