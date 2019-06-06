package ua.lviv.iot.Lab9;

import org.springframework.data.repository.CrudRepository;

public interface BicycleRepository extends CrudRepository<BicycleAccessories, Integer> {
}
