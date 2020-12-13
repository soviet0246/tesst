package leaseacar.model;

import javax.persistence.*;

@Entity
@Table(name = "cardata")
public class Cardata {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "version")
    private String version;
    @Column(name = "numerofdoors")
    private int numberOfDoors;
    @Column(name = "co2emission")
    private int co2Emission;
    @Column(name = "grossprice")
    private float grossPrice;
    @Column(name = "netprice")
    private float nettPrice;
    @Column(name = "mileage")
    private int mileage;
    @Column(name = "duration")
    private int duration;
    @Column(name = "interestrate")
    private float interestrate;
    @Column(name = "leaserate")
    private float leaserate;
    @Column(name = "name")
    private String name;
    @Column(name = "street")
    private String street;
    @Column(name = "housenumebr")
    private String housenumber;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "place")
    private String place;
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private String phonenumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(int co2Emission) {
        this.co2Emission = co2Emission;
    }

    public float getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(float grossPrice) {
        this.grossPrice = grossPrice;
    }

    public float getNettPrice() {
        return nettPrice;
    }

    public void setNettPrice(float nettPrice) {
        this.nettPrice = nettPrice;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(float interestrate) {
        this.interestrate = interestrate;
    }

    public float getLeaserate() {
        return leaserate;
    }

    public void setLeaserate(float leaserate) {
        this.leaserate = leaserate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
