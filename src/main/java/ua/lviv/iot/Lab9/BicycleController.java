package ua.lviv.iot.Lab9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BicycleController {

    @Autowired
    private BicycleRepository bicycleRepository;

    @RequestMapping(value = "/bicycle_accessories", method = RequestMethod.GET)
    public List<BicycleAccessories> getBicycleAccessor() {
        return (List<BicycleAccessories>) bicycleRepository.findAll();
    }

    @RequestMapping(value = "/bicycle_accessories/{id}", method = RequestMethod.GET)
    public BicycleAccessories getBicycleAccessories(@PathVariable Integer id) {
        return bicycleRepository.findById(id).get();
    }

    @RequestMapping(value = "/bicycle_accessories/{id}", method = RequestMethod.PUT)
    public BicycleAccessories replaceBicycleAccessories(@RequestBody BicycleAccessories newBicycleAccessories, @PathVariable Integer id) {
        return bicycleRepository.findById(id)
                .map(bicycleAccessories -> {
                    bicycleAccessories.setName(newBicycleAccessories.getName());
                    bicycleAccessories.setWeight(newBicycleAccessories.getWeight());
                    bicycleAccessories.setManufacturer(newBicycleAccessories.getManufacturer());
                    bicycleAccessories.setProducingCountry(newBicycleAccessories.getProducingCountry());
                    bicycleAccessories.setTypesManufacturer(newBicycleAccessories.getTypesManufacturer());
                    return bicycleRepository.save(bicycleAccessories);
                }).orElseGet(() -> {
                    newBicycleAccessories.setId(id);
                    return bicycleRepository.save(newBicycleAccessories);
                });
    }

    @RequestMapping(value = "/bicycle_accessories", method = RequestMethod.POST)
    public BicycleAccessories postStationaryGoods(@RequestBody BicycleAccessories bicycleAccessories) {
        return bicycleRepository.save(bicycleAccessories);
    }

     @RequestMapping(value = "/bicycle_accessories/{id}", method = RequestMethod.DELETE)
    public BicycleAccessories deleteEquity(@PathVariable Integer id){
             BicycleAccessories temp = getBicycleAccessories(id);
             bicycleRepository.deleteById(id);
             return temp;
         }
}
