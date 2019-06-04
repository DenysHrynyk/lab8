package ua.lviv.iot.lab8;

import org.springframework.data.repository.CrudRepository;

public interface BicycleRepository extends CrudRepository<BicycleAccessories, Integer> {
}
