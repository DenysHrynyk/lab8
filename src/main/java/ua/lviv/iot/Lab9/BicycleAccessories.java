package ua.lviv.iot.Lab9;


import javax.persistence.*;

@Entity
@Table(name = "bicycle_accessories")
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

    public BicycleAccessories() {

    }

    public BicycleAccessories(String name, double weight, String manufacturer,
                              TypesManufacturer producingCountry , ProducingCountry typesManufacturer) {
        this.name = name;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.producingCountry = producingCountry;
        this.typesManufacturer = typesManufacturer;
    }

    public  String getName() {
        return name;
    }

    public  void setName( String name) {
        this.name = name;
    }

    public  double getWeight() {
        return weight;
    }

    public  void setWeight( double weight) {
        this.weight = weight;
    }

    public  String getManufacturer() {
        return manufacturer;
    }

    public  void setManufacturer( String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypesManufacturer getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(TypesManufacturer producingCountry) {
        this.producingCountry = producingCountry;
    }

    public ProducingCountry getTypesManufacturer() {
        return typesManufacturer;
    }

    public void setTypesManufacturer(ProducingCountry typesManufacturer) {
        this.typesManufacturer = typesManufacturer;
    }
}
