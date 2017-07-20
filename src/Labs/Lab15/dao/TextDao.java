package Labs.Lab15.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

/*
Aaron Board
 */
public class TextDao implements CountriesDao {
    @Override
    public void writeCountries(ArrayList<String> countries) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("countries.txt"));
            for (String country: countries){
                bufferedWriter.write(country+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        String[] countries;
        try {
            countries = Files.readAllLines(new File("countries.txt").toPath()).toArray(new String[0]);
            for (String country : countries){
                System.out.println(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addCountry(String country) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("countries.txt", true));
            bufferedWriter.write(country+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getPath() {
        return "countries.txt";
    }
}
