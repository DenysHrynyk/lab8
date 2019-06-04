package ua.lviv.iot.lab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(BicycleRepository bicycleRepository){
		return (args) -> {
			bicycleRepository.save(new BicycleAccessories("Sdv2000", 350.0d, "Garmain", TypesManufacturer.GARMIN, ProducingCountry.CHINA));
			bicycleRepository.save(new BicycleAccessories("221", 12312, "12312", TypesManufacturer.SHIMANO, ProducingCountry.EUROPE));
		};
	}
}
