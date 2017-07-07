package Labs.Lab9;

/*
Aaron Board

7/7/2017
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 2000;
        price = 5000.0;
    }

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Make: %s\nModel: %s\nYear: %d\nPrice: $%.2f\n",make,model,year,price);
    }
}
