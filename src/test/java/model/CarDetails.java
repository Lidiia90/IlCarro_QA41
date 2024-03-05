package model;

import java.util.Objects;

public class CarDetails {

    private String location;
    private String manufacture;
    private String model;
    private String year;
    private String fuel;
    private String seats;
    private String CarClass;
    private String CarRegistrationNumber;
    private String Price;
    private String about;
    private String PhotosOfYourCar;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getCarClass() {
        return CarClass;
    }

    public void setCarClass(String carClass) {
        this.CarClass = carClass;
    }

    public String getCarRegistrationNumber() {
        return CarRegistrationNumber;
    }

    public void setCarRegistrationNumber(String carRegistrationNumber) {
        this.CarRegistrationNumber = carRegistrationNumber;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPhotosOfYourCar() {
        return PhotosOfYourCar;
    }
    public void setPhotosOfYourCar(String photosOfYourCar) {
        this.PhotosOfYourCar = photosOfYourCar;}

    public CarDetails(String location, String manufacture, String model, String year, String fuel, String seats, String carClass, String carRegistrationNumber, String price, String about, String photosOfYourCar) {
        this.location = location;
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.seats = seats;
        this.CarClass = carClass;
        this.CarRegistrationNumber = carRegistrationNumber;
        this.Price = price;
        this.about = about;
        this.PhotosOfYourCar = photosOfYourCar;
    }

    public CarDetails() {
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "location='" + location + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", fuel='" + fuel + '\'' +
                ", seats='" + seats + '\'' +
                ", CarClass='" + CarClass + '\'' +
                ", CarRegistrationNumber='" + CarRegistrationNumber + '\'' +
                ", Price='" + Price + '\'' +
                ", about='" + about + '\'' +
                ", PhotosOfYourCar='" + PhotosOfYourCar + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarDetails that)) return false;
        return Objects.equals(location, that.location) &&
                Objects.equals(manufacture, that.manufacture) &&
                Objects.equals(model, that.model) &&
                Objects.equals(year, that.year) &&
                Objects.equals(fuel, that.fuel) &&
                Objects.equals(seats, that.seats) &&
                Objects.equals(CarClass, that.CarClass) &&
                Objects.equals(CarRegistrationNumber, that.CarRegistrationNumber) &&
                Objects.equals(Price, that.Price) &&
                Objects.equals(about, that.about) &&
                Objects.equals(PhotosOfYourCar, that.PhotosOfYourCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, manufacture, model, year, fuel, seats, CarClass, CarRegistrationNumber, Price, about, PhotosOfYourCar);
    }
}

