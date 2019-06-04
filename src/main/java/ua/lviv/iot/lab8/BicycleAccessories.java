package ua.lviv.iot.lab8;

import javax.persistence.*;

@Entity
@Table(name = "bicycleAccessories")
public class BicycleAccessories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private double weight;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "producingCountry")
    private TypesManufacturer producingCountry;
    @Column(name = "typesManufacturer")
    private ProducingCountry typesManufacturer;

    public BicycleAccessories(
            final String name, final double weight, final String manufacturer, TypesManufacturer producingCountry , ProducingCountry typesManufacturer) {
        this.name = name;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.producingCountry = producingCountry;
        this.typesManufacturer = typesManufacturer;
    }

    public  String getName() {
        return name;
    }

    public  void setName(final String name) {
        this.name = name;
    }

    public  double getWeight() {
        return weight;
    }

    public  void setWeight(final double weight) {
        this.weight = weight;
    }

    public  String getManufacturer() {
        return manufacturer;
    }

    public  void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
