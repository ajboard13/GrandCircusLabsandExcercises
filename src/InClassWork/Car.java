package InClassWork;

import java.io.Serializable;

/*
POJOs - Plain Old Java Object
1.)no argument constructor
2.)getters and setters
3.)implements Serializable
    the Serializable interface is a tagging interface that
     notifies an application that objects can be serialized A.K.A: flattened
 */
public class Car implements Serializable{

    //using the transient keyword skips the variable from being saved
    //if you use this you will want to set the variable to a default value when you deserialize.
//    transient int test;
    String make;
    int mileage;
    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
