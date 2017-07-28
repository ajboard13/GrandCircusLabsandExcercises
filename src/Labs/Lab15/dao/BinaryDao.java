package Labs.Lab15.dao;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

/*
Aaron Board

7/20/2017
 */
public class BinaryDao implements CountriesDao {

    @Override
    public void writeCountries(ArrayList<String> countries) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("countries.dat", true)));
            for (String country: countries){
                dataOutputStream.writeUTF(country+"\n");
            }
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try {
            String[] countries = Files.readAllLines(new File("countries.dat").toPath()).toArray(new String[0]);

            for (String country : countries){
                System.out.println(country.substring(2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addCountry(String country) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("countries.dat", true)));

            dataOutputStream.writeUTF(country +"\n");
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPath() {
        return "countries.dat";
    }
}
