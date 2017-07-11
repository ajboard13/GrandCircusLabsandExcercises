package InClassWork;

import java.io.*;

/*
Aaron Board

7/11/2017
 */
public class FileIOApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Cruze");
        car.setMileage(75060);
        System.out.println(car);

        //this section is writing to a file

        try {

            //FileOutputStream knows how to connect and create a file
            //if the file being passed in as a parameter does not exist, it creates one automatically
            FileOutputStream fileStream = new FileOutputStream("testWrite.ser", true);

            //a class that lets you write objects, but it can't directly connect to the file.
            //needs fileStream
            //this is called chaining (Factory design pattern
            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            //this method serializes the object
            os.writeObject(car);

            //close the stream -- closing this closes all other streams as well
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //this section is reading from the file
        try {
            FileInputStream fileInputStream = new FileInputStream("testWrite.ser");

            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            System.out.println(ois.readObject());ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
