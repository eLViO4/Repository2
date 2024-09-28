package springbootSQL.sbSQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootSQL.sbSQL.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
